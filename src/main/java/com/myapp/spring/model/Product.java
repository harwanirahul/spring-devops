package com.myapp.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newproducts")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
=======








>>>>>>> 2874183ab872d2a0435c22b065a32ad03e095062
	private Integer productId;

	private String productName;

	private Double price;
<<<<<<< HEAD

	private String Description;
=======

	private String description;


	private String description;


	private String Description;


>>>>>>> 2874183ab872d2a0435c22b065a32ad03e095062

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, Double price, String description) {
		this.productName = productName;
		this.price = price;
		Description = description;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}