package siva.bootrestful.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private List<String> projects;
	private Map<Integer,String> departments;
	private Address employeeAddress;

}
