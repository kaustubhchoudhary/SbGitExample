package sb.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String method1() {
		return "Welcome";
	}
	
	@GetMapping("/new")
	public String methdo2() {
		return "This is some new content";
	}
}
