package spring.toy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Toy2SpElApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Toy2SpElApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run();
//		SpringApplication.run(Toy2SpElApplication.class, args);
	}

}
