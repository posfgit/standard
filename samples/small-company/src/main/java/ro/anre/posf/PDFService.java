package ro.anre.posf;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PushbuttonField;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.anre.posf.standard.*;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

@Service
public class PDFService {
    @Autowired
    XmlMapper xmlMapper;

    private static final String FILE_NAME = System.getProperty("pdf-input");
    private static final String SIGNATURE_NAME =System.getProperty("pdf-sign");
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

        Map<String, String> keys =  ObjectMapperUtil.objectFieldMapper(msg, null);

        for(String key: keys.keySet()) {
            form.setField(key, keys.get(key));
        }

        addSignature(form);

        stamper.setFormFlattening(true);
        stamper.close();
        reader.close();

        outputStream.flush();
        outputStream.close();
    }

    @SneakyThrows
    private void addSignature(AcroFields form) {
        PushbuttonField ad = form.getNewPushbuttonFromField("client.signature");
        ad.setProportionalIcon(true);

        try (InputStream signStream = new FileInputStream(SIGNATURE_NAME)) {
            ad.setImage(Image.getInstance(signStream.readAllBytes()));
        }

        form.replacePushbuttonField("client.signature", ad.getField());
    }
}
