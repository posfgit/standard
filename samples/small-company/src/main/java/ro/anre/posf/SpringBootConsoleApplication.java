package ro.anre.posf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootConsoleApplication  implements CommandLineRunner{

	@Autowired
	ReadAndSendMessages readAndSendMessages;

	@Autowired
	ReceiveMessages posfClientReceiver;

	@Autowired
	PDFService pdfService;

	@Override
	public void run(String... args) throws Exception {

		if(System.getProperty("user") == null ){
			System.out.println("parametrul -Duser nu este trimis");
		}else if(System.getProperty("password") == null){
			System.out.println("parametrul -Dpassword nu este trimis");
		}else if(System.getProperty("type") == null){
			System.out.println("parametrul -Dtype nu este trimis");
		}else {
			switch (System.getProperty("type")){
				case "send":
					readAndSendMessages.start();
					break;
				case "receive":
					if(System.getProperty("max-message") == null){
						System.out.println("parametrul -Dmax-message nu este trimis");
					}else{
						posfClientReceiver.receive();
					}

					break;
				case "pdf":
					if(System.getProperty("pdf-input") == null){
						System.out.println("parametrul -Dpdf-input nu este trimis");
					}else if(System.getProperty("pdf-xml-input") == null){
						System.out.println("parametrul -Dpdf-xml-input nu este trimis");
					}else{
						pdfService.fill();
					}

					break;
				default:
					System.out.println("parametrul -Dtype nu este bun");
			}
		}
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootConsoleApplication.class)
				.web(WebApplicationType.NONE)
				.bannerMode(Banner.Mode.OFF)
				.run(args);



	}
}
