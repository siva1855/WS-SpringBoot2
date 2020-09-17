package siva.bootrestful.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import siva.bootrestful.model.Student;

//RestTemplate
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestStudentRestConsumer {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@LocalServerPort
	private int localPort;

	@Test
	@Disabled
	public void testOne() {
		String url = "http://localhost:" + localPort + "/rest/student/one/11";
		ResponseEntity<Student> response = testRestTemplate.exchange(url, HttpMethod.GET, null, Student.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
	}

	@Test
	@Disabled
	public void testAll() {
		String url = "http://localhost:" + localPort + "/rest/student/all";
		ResponseEntity<List<Student>> response = testRestTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals(3, response.getBody().size());
	}

	@Test
	@Disabled
	public void testRemove() {
		String url = "http://localhost:" + localPort + "/rest/student/remove/11";
		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.DELETE, null, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		if (!response.getBody().contains("removed")) {
			fail("Unable to remove data");
		}
	}

	@Test
	@Disabled
	public void testSave() {
		String url = "http://localhost:" + localPort + "/rest/student/save";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Student s = new Student("RK", 88.88, "HIB");
		HttpEntity<Student> request = new HttpEntity<Student>(s, headers);
		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.POST, request, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		if (!response.getBody().contains("saved")) {
			fail("Unable to remove data");
		}
	}

	@Test
	public void testUpdate() {
		String url = "http://localhost:" + localPort + "/rest/student/update";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Student student = new Student(2, "DRD", 88.5, "NEW");
		HttpEntity<Student> req = new HttpEntity<Student>(student, headers);
		ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.PUT, req, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		if (!response.getBody().contains("Updated")) {
			fail("Unable to Updated data");
		}
	}
}
