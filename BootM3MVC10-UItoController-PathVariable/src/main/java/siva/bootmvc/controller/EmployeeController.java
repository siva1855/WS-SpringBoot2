package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/show/{id}/{name}/{salary}")
	public String ShowEmployeeData(@PathVariable("id") Integer employeeId,
			@PathVariable("name") String employeeName,
			@PathVariable("salary") Double employeeSalary, Model model) {
		model.addAttribute("displayId", employeeId);
		model.addAttribute("displayName", employeeName);
		model.addAttribute("displaySalary", employeeSalary);
		return "EmployeeData";
	}
}
