package ro.anre.posf;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.underscore.Json;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PushbuttonField;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.anre.posf.config.ObjectMapperConfiguration;
import ro.anre.posf.standard.*;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class PDFService {
    @Autowired
    XmlMapper xmlMapper;

    private static final String FILE_NAME = System.getProperty("pdf-input");
    private static final String CLIENT_SIGNATURE_NAME = System.getProperty("pdf-client.signature");
    private static final String SUPPLIER_SIGNATURE_NAME = System.getProperty("pdf-supplier.signature");
    private static final String OPERATOR_SIGNATURE_NAME = System.getProperty("pdf-operator.signature");
    private static final String XML_FILE_PATH = System.getProperty("pdf-xml-input");


    @SneakyThrows
    public void fill() {
        InputStream inputStream = new FileInputStream(FILE_NAME);
        PdfReader reader = new PdfReader(inputStream);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        String outputFileName = String.join("_filled.", FILE_NAME.split("\\.(?=[^\\.]+$)"));
        File outputFile = new File( outputFileName);

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        PdfStamper stamper = new PdfStamper(reader, outputStream);

        AcroFields form = stamper.getAcroFields();
        String xmlawd = Files.readString(Path.of(XML_FILE_PATH), Charset.defaultCharset());
        Message msg =  xmlMapper.readValue(xmlawd, Message.class);

        Contract contract = (Contract) msg
                .getClass()
                .getDeclaredMethod("getContract")
                .invoke(msg);

        String jsonAsString = ObjectMapperConfiguration.get().writeValueAsString(contract);
        engine.eval("var contract = " + jsonAsString);

        List<String> ignoredKeys = List.of("client.signature", "supplier.signature", "operator.signature");


        for (Object fieldKey : form.getFields().keySet()){
            String val = "";
            if(!ignoredKeys.contains(fieldKey.toString())){
                try{
                    val =  engine.eval(fieldKey.toString()).toString();
                }catch (ScriptException | NullPointerException e){
                    System.out.println(e.getMessage() + fieldKey);
                }

                if(form.getFieldType(fieldKey.toString()) == AcroFields.FIELD_TYPE_CHECKBOX){
                    form.setField(fieldKey.toString(), getCheckBoxValue(val));
                }else if(form.getFieldType(fieldKey.toString()) == AcroFields.FIELD_TYPE_RADIOBUTTON){
                    form.setField(fieldKey.toString(), getRadioValue(val, fieldKey.toString(), form));
                }else{
                    form.setField(fieldKey.toString(), val);
                }
            }
        }


        addSignature(form, "client.signature", CLIENT_SIGNATURE_NAME);
        addSignature(form, "supplier.signature", SUPPLIER_SIGNATURE_NAME);
        addSignature(form, "operator.signature", OPERATOR_SIGNATURE_NAME);

        stamper.setFormFlattening(true);
        stamper.close();
        reader.close();

        outputStream.flush();
        outputStream.close();
    }


    private String getCheckBoxValue(String val){
        if(Boolean.parseBoolean(val)){
            return "Yes";
        }else{
            return "Off";
        }
    }
    private String getRadioValue(String val, String key, AcroFields form){
        if(Boolean.parseBoolean(val)){
            return form.getAppearanceStates(key)[0];
        }else{
            return "Off";
        }
    }


    @SneakyThrows
    private void addSignature(AcroFields form, String signature, String signatureName) {
        if(signatureName == null){
            return;
        }

        PushbuttonField ad = form.getNewPushbuttonFromField(signature);
        if(ad == null){
            return;
        }

        ad.setProportionalIcon(true);

        try (InputStream signStream = new FileInputStream(signatureName)) {
            ad.setImage(Image.getInstance(signStream.readAllBytes()));
        }

        form.replacePushbuttonField(signature, ad.getField());
    }
}
