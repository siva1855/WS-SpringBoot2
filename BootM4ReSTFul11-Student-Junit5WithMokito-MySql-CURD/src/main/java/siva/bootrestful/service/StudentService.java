package siva.bootrestful.service;

import java.util.List;
import java.util.Optional;

import siva.bootrestful.model.Student;

public interface StudentService {

	public Integer saveStudent(Student student);

	public List<Student> getAllStudents();

	public Optional<Student> getOneStudent(Integer id);

	public boolean isExist(Integer id);

	public void deleteStudent(Integer id);
}
