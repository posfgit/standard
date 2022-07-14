package ro.anre.posf;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PushbuttonField;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.anre.posf.standard.*;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


        String outputFileName = String.join("_filled.", FILE_NAME.split("\\.(?=[^\\.]+$)"));
        File outputFile = new File( outputFileName);

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        PdfStamper stamper = new PdfStamper(reader, outputStream);

        AcroFields form = stamper.getAcroFields();
        String xmlawd = Files.readString(Path.of(XML_FILE_PATH), Charset.defaultCharset());
        Message msg =  xmlMapper.readValue(xmlawd, Message.class);

        Map<String, String> objectKeys =  ObjectMapperUtil.objectFieldMapper(msg, null);
        List<String> ignoredKeys = List.of("client.signature", "supplier.signature", "operator.signature");

        for (Object fieldKey : form.getFields().keySet()){
            String key = (String) fieldKey;
            if(key.startsWith("concat(")){
                concat(key, objectKeys, form);
            }else if(key.startsWith("!(")){
                negate(key, objectKeys, form);
            }else{
                if(!ignoredKeys.contains(key) && (objectKeys.get(key) == null || objectKeys.get(key).isEmpty())){
                    System.out.println("Pathul: " + key + " nu exista in mesaj");
                }else if(!ignoredKeys.contains(key) ){
                    String val = objectKeys.get(key);
                    Pattern pattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(val);
                    if(matcher.matches()) {
                        parseBoolean(key, val, form, false);
                    }else{
                        form.setField(key, val);
                    }
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

    @SneakyThrows
    private void parseBoolean(String key, String val, AcroFields form, boolean negate){
        if(Boolean.parseBoolean(val)){
            form.setField(key, negate ? "Off" : "Yes");
        }else{
            form.setField(key, negate ? "Yes" : "Off");
        }
    }

    @SneakyThrows
    private void negate(String key, Map<String, String> objectKeys, AcroFields form) {
        String elName = key.replace("!(","").replace(")","");
        String elValue = objectKeys.get(elName);
        if(elValue != null){
            Pattern pattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(elValue);
            if(matcher.matches()) {
                parseBoolean(key, elValue, form, true);
            }else{
                System.out.println("Pathul: " + elName + " nu este de tip boolean");
            }

        }else{
            System.out.println("Pathul: " + elName + " nu exista in mesaj");
        }
    }

    @SneakyThrows
    private void concat(String key, Map<String, String> objectKeys, AcroFields form){
        String[] arr = key.replace("concat(","").replace(")","").split(",");
        StringBuilder finalVal = new StringBuilder();
        for (String el : arr) {
            if(objectKeys.get(el) != null){
                finalVal.append(objectKeys.get(el));
            }else{
                finalVal.append(el.replaceAll("'",""));
            }
        }
        form.setField(key, String.valueOf(finalVal));
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
