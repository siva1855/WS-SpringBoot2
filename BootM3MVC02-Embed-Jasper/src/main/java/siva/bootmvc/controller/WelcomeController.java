package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
    //default is GET
	@RequestMapping("/welcome")
	public String wish() {
		return "HomePage";
	}
}
