package sujet.sujet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SujetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SujetApplication.class, args);
		System.out.println("server launched on port 3000");}

}
