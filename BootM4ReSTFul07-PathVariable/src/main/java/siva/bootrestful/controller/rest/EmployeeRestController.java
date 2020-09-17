package siva.bootrestful.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@GetMapping("/emp/{eid}/{ename}/{esal}")
	public ResponseEntity<String> readPath(@PathVariable Integer eid,
			                               @PathVariable String ename,
			                               @PathVariable Double esal) {

		String body = "Data is--> " + eid + "," + ename + "," + esal;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

}
