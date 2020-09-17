package siva.bootrestful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	private Integer studentId;
	
	@NonNull
	private String studentName;
	@NonNull
	private Double studentFee;
	@NonNull
	private String studentCourse;
}
