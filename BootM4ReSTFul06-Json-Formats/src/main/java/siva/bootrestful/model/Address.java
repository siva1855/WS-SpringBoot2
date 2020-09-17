package siva.bootrestful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String houseNumber;
	private String streetName;
	private String villageName;
	private String mandal;
	private String district;
	private String state;
}
