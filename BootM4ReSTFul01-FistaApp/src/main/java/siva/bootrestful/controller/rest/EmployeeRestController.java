package siva.bootrestful.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	@GetMapping("/find")
	public ResponseEntity<String> show() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
}
