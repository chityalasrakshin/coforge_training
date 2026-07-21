package com.coforge.pms.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "product_name")
	@NotBlank(message = "Product name cannot be empty")
	private String productName;
	
	@Column(name = "product_price")
	@Positive(message = "Product price must be greater than zero")
	private Double productPrice;
	
	@Column(name = "product_quantity")
	@Positive(message = "Product quantity must be greater than zero")
	private int productQuantity;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, Double productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}
	
	
	
	
	
}
