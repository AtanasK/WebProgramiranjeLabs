package mk.atanask.labsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LabswebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabswebApplication.class, args);
	}
}
