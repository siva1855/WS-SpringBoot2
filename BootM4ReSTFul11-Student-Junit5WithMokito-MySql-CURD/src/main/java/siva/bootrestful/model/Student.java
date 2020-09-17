package siva.bootrestful.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenttest_table")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer studentId;

	@Column(name = "sname")
	private String studentName;
	@Column(name = "scourse")
	private String studentCourse;
	@Column(name = "sfee")
	private Double studentFee;

}
