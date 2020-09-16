package siva.bootrestful.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
//it is to enable the Xml format
@XmlRootElement
public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
}
