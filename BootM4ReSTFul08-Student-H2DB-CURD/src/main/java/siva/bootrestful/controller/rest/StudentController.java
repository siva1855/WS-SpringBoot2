package siva.bootrestful.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.bootrestful.model.Student;
import siva.bootrestful.service.StudentService;

@RestController
@RequestMapping("/rest/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	/**
	 * 1. This method takes Student object as input from JSON/XML using @RequestBody
	 * and returns ResponseEntity<T>.call service.saveStudent(ob)
	 */
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		ResponseEntity<String> response = null;
		try {
			Integer id = studentService.saveStudent(student);
			response = new ResponseEntity<String>(id + "-saved", HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to Save", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

	/***
	 * 2. This method reads data from DB using findAll() and returns List<Student>
	 * if data exist or String (not exist) as ResponseEntity using
	 * annotation @ResponseBody
	 */

	@GetMapping("/all")
	public ResponseEntity<?> getAllStudents() {
		ResponseEntity<?> response = null;
		try {
			List<Student> list = studentService.getAllStudents();
			if (list != null && !list.isEmpty())
				response = new ResponseEntity<List<Student>>(list, HttpStatus.OK);
			else
				response = new ResponseEntity<String>("No Data Found", HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to fetch Data", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}
	
	

	/**
	 * 3. Read PathVariable id (as input) * use service layer to find one object
	 * based on Id. Return Student if exist else String (error message) as
	 * ResponseEntity<?>
	 */

	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneStudent(@PathVariable Integer id) {
		ResponseEntity<?> response = null;
		try {
			Optional<Student> opt = studentService.getOneStudent(id);
			if (opt.isPresent())
				response = new ResponseEntity<Student>(opt.get(), HttpStatus.OK);
			else
				response = new ResponseEntity<String>("No Data Found", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to Fetch Data", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

	
	
	/**
	 * 4. Read pathVariable id check row exist or not if exist call service delete
	 * else return String error msg
	 */
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		ResponseEntity<String> response = null;
		try {
			boolean exist = studentService.isExist(id);
			if (exist) {
				studentService.deleteStudent(id);
				response = new ResponseEntity<String>(id + "-removed", HttpStatus.OK);
			} else {
				response = new ResponseEntity<String>(id + "-Not Exist", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to Delete", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

	
	
	
	/**
	 * 5. Read Input as JSON/XML using
	 * 
	 * @RequestBody , check id exist or not if exist call service save method Return
	 *              ResponseeEntity
	 */
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		ResponseEntity<String> response = null;
		try {
			boolean exist = studentService.isExist(student.getStudentId());
			if (exist) {
				studentService.saveStudent(student);
				response = new ResponseEntity<String>(student.getStudentId() + "-Updated", HttpStatus.OK);
			} else {
				response = new ResponseEntity<String>(student.getStudentId() + "-Not Exist", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to Update", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

}
