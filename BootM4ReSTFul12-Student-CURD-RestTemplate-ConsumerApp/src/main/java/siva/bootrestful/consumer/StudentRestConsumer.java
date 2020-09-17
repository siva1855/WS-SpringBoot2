package siva.bootrestful.consumer;

import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import siva.bootrestful.model.Student;

@Component
public class StudentRestConsumer {

	public Student getOneStudent(Integer id) {
		String url = "http://localhost:9898/rest/student/one/" + id;
		RestTemplate restTemplate = new RestTemplate();
		// ResponseEntity<Student> resp=rt.getForEntity(url, Student.class);
		// url, MethodType, request, responseType
		ResponseEntity<Student> response = restTemplate.exchange(url, HttpMethod.GET, null, Student.class);
		return response.getBody();
	}

	public List<Student> getAllStudents() {
		String url = "http://localhost:9898/rest/student/all";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Student>> response = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		return response.getBody();
	}

	public String deleteOne(Integer id) {
		String url = "http://localhost:9898/rest/student/remove/" + id;
		RestTemplate restTemplate = new RestTemplate();
		// URL, Method, Input(Request), Output(Response)Type
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class);
		return response.getBody();
	}

	public String save(Student s) {
		String url = "http://localhost:9898/rest/student/save/";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		// Student s=new Student("RR", 9.39, "MNO");
		HttpEntity<Student> request = new HttpEntity<Student>(s, headers);
		// URL, MethodType, request(body+Headers), ResponseType
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
		return response.getBody();
	}

	public String update(Student s) {
		String url = "http://localhost:9898/rest/student/update/";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Student> request = new HttpEntity<Student>(s, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, request, String.class);
		return response.getBody();
	}
}
