package siva.bootrestful.controller.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	@GetMapping("/a")
	public String showDataA() {
		return "Hello World-@GetMapping";
	}

	@PostMapping("/b")
	public String showDataB() {
		return "Hello World-@PostMapping";
	}

	@PutMapping("/c")
	public String showDataC() {
		return "Hello World-@PutMapping";
	}

	@DeleteMapping("/d")
	public String showDataD() {
		return "Hello World-@DeleteMapping";
	}
}
