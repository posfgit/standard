package ro.anre.posf;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ro.anre.posf.dto.Response;
import ro.anre.posf.dto.UserDTO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

@Component
public class ReadAndSendMessages {

    @Value("${props.in-folder-name}")
    private String inFolderName;

    @Value("${props.out-folder-name}")
    private String outFolderName;
    @Autowired
    Utils utils;

    @Autowired
    XmlMapper xmlMapper;

    @Autowired
    RestTemplate restTemplate;

    public void start() throws IOException {
        String inPath ="./" + inFolderName;
        String outPath = "./" + outFolderName + "/";

        if(this.checkRequirements(inPath, outPath)){
            File dir = new File(inPath);

            File [] files = dir.listFiles((d, name) -> name.endsWith(".xml"));

            if (files != null) {
                UserDTO user = this.utils.getUserPassFromUser();
                String token = this.utils.login(user);
                System.out.println("Total fisiere:" + files.length);
                int count = 0;
                for (File file: files) {
                    String xml = Files.readString(file.toPath(), Charset.defaultCharset());

                    Response resp = this.sendMessage(token, xml);

                    xmlMapper.writeValue(new File(outPath + "response" + resp.getMessageID() +".xml"), resp);

                    moveFile(file, new File(outPath + file.getName()));
                    System.out.println("Am finalizat:  " + resp.getMessageID());
                    System.out.println("Am procesat:   " + ++count + " din " +files.length);

                }
            }
        }

    }

    public  void moveFile(File src, File dest) throws IOException {
        Files.move(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }


    public boolean checkRequirements(String inPath, String outPath){
        File inDir = new File(inPath);
        if (!inDir.exists() || !inDir.isDirectory()) {
            System.out.println("Folderul IN nu exista langa jar");
            return false;
        }

        File outDir = new File(outPath);
        if (!outDir.exists() || !outDir.isDirectory()) {
            System.out.println("Folderul OUT nu exista langa jar");
            return false;
        }

        return true;
    }

    public Response sendMessage(String token, String xml){
        return restTemplate
                .exchange(SpringBootConsoleApplication.domain + "/broker/postMessage",
                        HttpMethod.POST,
                        setPayload(token, xml),
                        Response.class)
                .getBody();
    }

    private HttpEntity<String> setPayload(String token, String payload){
        HttpHeaders authHeader = new HttpHeaders();
        authHeader.setContentType(MediaType.APPLICATION_XML);
        authHeader.setBearerAuth(token);

        return new HttpEntity<>(payload, authHeader);
    }

}
