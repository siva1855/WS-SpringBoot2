package siva.bootrestful.controller.rest;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.bootrestful.model.Address;
import siva.bootrestful.model.Employee;

@RestController
public class EmployeeRestController {
	@GetMapping("/format")
	public Employee showJsonFormat() {
		return new Employee(101, "Sivakumar", List.of("Dalmia", "JSW"),
				Map.of(1, "Development", 2, "Testing", 3, "UAT", 4, "Production"),
				new Address("2-100", "PostOfficeBazar", "Pinnelli", "machavaram", "guntur", "AP"));
	}
}
