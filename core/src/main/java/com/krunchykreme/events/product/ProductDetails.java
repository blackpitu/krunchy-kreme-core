package com.krunchykreme.events.product;

import java.util.UUID;

public class ProductDetails {
	private Integer key;
	private String name;
	private String description;

	public ProductDetails() {
		setKey(null);
	}

	public ProductDetails(Integer key) {
		this.setKey(key);
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

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ProductDetails [key=" + key + ", name=" + name
				+ ", description=" + description + "]";
	}
}
