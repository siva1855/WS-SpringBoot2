package siva.bootmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTTABLE")
public class Product {

	@Id
	@GeneratedValue

	@Column(name = "prodid")
	private Integer productId;

	@Column(name = "prodname")
	private String productName;

	@Column(name = "prodcost")
	private Double productCost;

	@Column(name = "prodgst")
	private Double productGst;

	@Column(name = "proddiscount")
	private Double productDiscount;

}
