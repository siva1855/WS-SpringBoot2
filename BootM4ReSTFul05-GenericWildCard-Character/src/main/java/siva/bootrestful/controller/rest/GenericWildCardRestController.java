package siva.bootrestful.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import siva.bootrestful.model.Employee;

@RestController
public class GenericWildCardRestController {
	
	@PostMapping("/data")
	public ResponseEntity<?> readData(@RequestParam Integer id) {
		if (id == 0) {
			return new ResponseEntity<String>("No Data Found", HttpStatus.BAD_REQUEST);
		} else {

			Employee employee = new Employee(1, "Kumar", 3.8);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
	}

}
