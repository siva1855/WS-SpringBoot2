package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

	@RequestMapping("/data")
	public String readData(@RequestParam("sid") Integer id,
			               @RequestParam(value="sname",required=false,defaultValue="NONE") String name,
			               @RequestParam(value="scourse",required=false) String course, Model model) {
		model.addAttribute("displayId", id);
		model.addAttribute("displayName", name);
		model.addAttribute("displayCourse", course);

		return "DataPage";
	}
}
