package sb.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbGitExampleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SbGitExampleApplication.class, args);
		
		System.out.println("Greeting for the day");
	
		System.out.println("That is a great day");
	
	}
}
