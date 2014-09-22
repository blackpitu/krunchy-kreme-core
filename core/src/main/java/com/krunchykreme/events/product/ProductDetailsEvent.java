package com.krunchykreme.events.product;

import com.krunchykreme.events.ReadEvent;

public class ProductDetailsEvent extends ReadEvent {
	private Integer key;
	ProductDetails details;

	public ProductDetailsEvent(Integer key) {
		this.key = key;
	}

	public ProductDetailsEvent(Integer key, ProductDetails details) {
		this.key = key;
		this.details = details;
	}



	public static ProductDetailsEvent notFound(Integer key) {
		ProductDetailsEvent ev = new ProductDetailsEvent(key);
		ev.entityFound = false;
		return ev;
	}

	public Integer getKey() {
		return key;
	}

	@Override
	public String toString() {
		return "ProductDetailsEvent [key=" + key + ", details=" + details + "]";
	}

	public ProductDetails getDetails() {
		return details;
	}
	
	
	
}
