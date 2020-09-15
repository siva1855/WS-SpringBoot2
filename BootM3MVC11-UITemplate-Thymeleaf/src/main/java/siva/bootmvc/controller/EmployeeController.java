package siva.bootmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import siva.bootmvc.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public String showData(Model model) {
		model.addAttribute("message", "Welcome to Everybody!!!!!!");

		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Sivakumar");
		employee.setEmployeeSalary(4.5);
		model.addAttribute("listData", employee);

		// JDK9
		List<String> al = List.of("Milky", "Cherry");
		model.addAttribute("alData", al);
		return "Info";
	}
}
