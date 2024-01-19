package hw.lexio;

import hw.lexio.service.CreateDeckService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LexioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LexioApplication.class, args);
		System.out.println("재밌는 렉시오^^");
	}


}
