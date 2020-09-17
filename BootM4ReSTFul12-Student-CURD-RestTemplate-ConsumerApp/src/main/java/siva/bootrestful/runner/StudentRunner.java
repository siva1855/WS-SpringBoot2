package siva.bootrestful.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siva.bootrestful.consumer.StudentRestConsumer;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRestConsumer studentRestConsumer;
	
	
	public void run(String... args) throws Exception {
		
		System.out.println("from consumer");
		
		// Test get One
		
		/*
		 * Student student=studentRestConsumer.getOneStudent(2);
		 * System.out.println(student);
		 */
		 
		 		
		//Test all rows
		studentRestConsumer.getAllStudents().forEach(System.out::println);
		
		//remove one
		/*
		 * String message=studentRestConsumer.deleteOne(10);
		 * System.out.println(message);
		 */
		
		//save one student
		/*
		 * String message1=studentRestConsumer.save(new Student("RR", 9.9, "JAA"));
		 * System.out.println(message1);
		 */
		 
		//update one student
		/*
		 * String message2=studentRestConsumer.update(new Student(1, "NEW RR", 999.99,
		 * "AAAAAAA")); System.out.println(message2);
		 */
		//stop server
		  System.exit(0);
		  
		 		}
		
		
		
		
		
	}

