package siva.bootrestful.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import siva.bootrestful.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	// 1.Header http://localhost:8989/emp/show?employeeId=101&employeeName="siva"
	@GetMapping("/show")
	public ResponseEntity<String> readDataA(@RequestParam Integer employeeId, @RequestParam String employeeName) {
		String message = "ID : " + employeeId + " Name : " + employeeName;
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

	// 2.Header http://localhost:8989/emp/info?username="siva"&password="AAAA"
	@GetMapping("/info")
	public ResponseEntity<String> readDataB(@RequestParam String username, @RequestParam String password) {
		String body = "User Name: " + username + " Password : " + password;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

	//3.Read JSON/XML as Object data
	@PostMapping("/data")
	public ResponseEntity<String> readDataC(@RequestBody Employee employee) {

		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
}
