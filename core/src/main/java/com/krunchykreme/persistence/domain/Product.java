package com.krunchykreme.persistence.domain;

import java.util.UUID;

import javax.persistence.*;

import com.krunchykreme.events.product.ProductDetails;

@Entity(name = "product")
public class Product {
	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

	public ProductDetails toProductDetails() {
		ProductDetails p = new ProductDetails();
		p.setKey(id);
		p.setName(name);
		p.setDescription(description);
		
		return p;
	}
	
	
}
