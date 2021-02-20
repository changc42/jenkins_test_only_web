package changc42.jenkins_test_only_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestOnlyWebApplication {

	@GetMapping(path="/")
	String foo(){
		return "6ix9ine";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestOnlyWebApplication.class, args);
	}

}
