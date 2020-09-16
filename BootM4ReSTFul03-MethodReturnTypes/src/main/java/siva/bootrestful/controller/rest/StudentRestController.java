package siva.bootrestful.controller.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.bootrestful.model.Student;

@RestController
public class StudentRestController {

	// 1.method return type-->void
	@GetMapping("/showA")
	public void printA() {
		System.out.println("return type is void");
	}

	@GetMapping("/showB")
	public String printB() {
		return "return type is String";
	}

	@GetMapping("/showC")
	public Student printC() {
		return new Student(1, "siva", 27, "java", 4000.70);
	}

	@GetMapping("/showD")
	public List<Student> printD() {
		return List.of(new Student(1, "siva", 27, "java", 4000.70),
				new Student(2, "cherry", 12, "6thClass", 14000.70),
				new Student(3, "milky", 7, "2ndClass", 24000.70),
				new Student(4, "kumar", 28, "Spring", 34000.70));
	}
	
	@GetMapping("/showE")
	public Map<String,Student> printE() {
		          //    key       value
		return Map.of("Object1",new Student(1, "siva", 27, "java", 4000.70),
				      "Object2",new Student(2, "cherry", 12, "6thClass", 14000.70),
				      "Object3",new Student(3, "milky", 7, "2ndClass", 24000.70),
				      "Object4",new Student(4, "kumar", 28, "Spring", 34000.70));
	}
	@GetMapping("/showF")
	public ResponseEntity<String> printF(){
		return new ResponseEntity<String>("from ResponseEntity",HttpStatus.OK);
	}
}
