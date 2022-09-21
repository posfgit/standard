package ro.anre.posf;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ro.anre.posf.dto.Response;
import ro.anre.posf.dto.UserDTO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class ReceiveMessages {
    @Value("${props.receive-folder-name}")
    private String receiveFolderName;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Utils utils;

    @Autowired
    XmlMapper xmlMapper;


    public void receive() throws IOException, InterruptedException {
        String outPath = "./" + receiveFolderName + "/";
        int maxMessage = Integer.parseInt(System.getProperty("max-message"));
        boolean own = false;

        if (System.getProperty("own") != null) {
            own = Boolean.parseBoolean(System.getProperty("own"));
        }

        if(this.checkRequirements(outPath)){
            UserDTO user = this.utils.getUserPassFromUser();

            String token = this.utils.login(user);
            this.getMessage(token, outPath, 0, maxMessage, own);
        }
    }

    public void getMessage(String token, String outPath, int count, int maxMessage, boolean own) throws IOException, InterruptedException {
        ResponseEntity<String> response = restTemplate
                .exchange(SpringBootConsoleApplication.domain  + "/broker" + (own ? "/own/" : "/" ) + "poolMessage",
                        HttpMethod.GET,
                        setPayload(token),
                        String.class);

        if(response.getStatusCode().equals(HttpStatus.OK) ){
            Response resp = xmlMapper.readValue(response.getBody(), Response.class);
            Files.write(Paths.get(outPath + "response-" + resp.getMessageID() + ".xml"), response.getBody().getBytes());

            System.out.println("Scris: " + ++count + "  " + resp.getMessageID());

            if(maxMessage > count){
                Thread.sleep(3000);
                getMessage(token, outPath, count, maxMessage, own);
            }else{
                System.out.println("Limita max-message a fost atinsa , rulati iar");
            }

        }else{
            System.out.println("Nu exista mesaje pentru consum in acest moment");
        }
    }




    private HttpEntity<String> setPayload(String token){
        HttpHeaders authHeader = new HttpHeaders();
        authHeader.setContentType(MediaType.APPLICATION_XML);
        authHeader.setBearerAuth(token);

        return new HttpEntity<>(authHeader);
    }

    public boolean checkRequirements(String outPath){
        File outDir = new File(outPath);
        if (!outDir.exists() || !outDir.isDirectory()) {
            System.out.println("Folderul Receive nu exista langa jar");
            return false;
        }

        return true;
    }
}
