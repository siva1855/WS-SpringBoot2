package siva.bootmvc.model;

import java.util.List;

public class Product {

	private Integer productId;
	private String productName;
	private Double productCost;
	private String productModel;
	private String productDescription;
	private String productColor;
	// checkbox
	private List<String> productGrade;
	// multi-select dropdown
	private List<String> productBrand;

	public Product() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public List<String> getProductGrade() {
		return productGrade;
	}

	public void setProductGrade(List<String> productGrade) {
		this.productGrade = productGrade;
	}

	public List<String> getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(List<String> productBrand) {
		this.productBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productModel=" + productModel + ", productDescription=" + productDescription + ", productColor="
				+ productColor + ", productGrade=" + productGrade + ", productBrand=" + productBrand + "]";
	}

}
