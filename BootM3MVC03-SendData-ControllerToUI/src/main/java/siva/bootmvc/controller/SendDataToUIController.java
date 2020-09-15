package siva.bootmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import siva.bootmvc.model.Employee;

@Controller
public class SendDataToUIController {

	@RequestMapping("/show")
	public String showData(Model model) {
		// primitive Data
		model.addAttribute("id", 81426518);
		model.addAttribute("name", "Sivakumar");
		model.addAttribute("fee", 5000);
		// Object Date
		Employee employee = new Employee(5848, "Saidarao", "Senior Engineer");
		model.addAttribute("empUI", employee);

		//Collection data
		List<String> list = List.of("core java", "Spring", "boot", "Angular");
		model.addAttribute("listUI", list);

		Map<Integer, String> map = Map.of(8, "OOPs", 7, "Collections", 5, "MultiThreading");
		model.addAttribute("mapUI", map);

		return "DataPage";
	}
}
