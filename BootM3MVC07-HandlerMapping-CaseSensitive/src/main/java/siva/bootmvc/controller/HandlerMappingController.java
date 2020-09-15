package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HandlerMappingController {

	@RequestMapping("/")
	public String showWelcomePage() {
		return "WelcomePage";
	}

	@RequestMapping("/data")
	public String showDataPage() {
		return "DataPage";
	}

	@RequestMapping(value = "/data", method = POST)
	public String showSamplePage() {
		return "SamplePage";
	}
}
