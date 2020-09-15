package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HandlerMappingController {

	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "WelcomePage";
	}

	@RequestMapping("/data")
	public String showDataPage() {
		return "DataPage";
	}

	@RequestMapping(value = "/sample", method = RequestMethod.POST)
	public String showSamplePage() {
		return "SamplePage";
	}
}
