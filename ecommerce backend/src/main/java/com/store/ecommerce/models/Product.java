package com.store.ecommerce.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@TypeAlias("Product")
public class Product {
	@Id
	private String id;
	
	private String name;

	private String description;
	
	private float price;
	
	private String image_URL;
	
	private Category category;

	@DBRef
	private Seller seller;

	public Product(){
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getImage_URL() {
		return image_URL;
	}

	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Product(String name, String description, float price, String image_URL, Category category,
			Seller seller) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.image_URL = image_URL;
		this.category = category;
		this.seller = seller;
	}

	

}
