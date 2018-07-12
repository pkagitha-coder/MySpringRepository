package Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello Boot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
}
