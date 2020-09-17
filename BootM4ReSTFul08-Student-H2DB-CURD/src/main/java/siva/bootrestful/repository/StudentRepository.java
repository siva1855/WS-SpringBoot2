package siva.bootrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.bootrestful.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
