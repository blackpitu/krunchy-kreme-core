package com.krunchykreme.events.product;

import com.krunchykreme.events.CreateEvent;

public class CreateProductEvent extends CreateEvent {
	private ProductDetails details;
	
	public CreateProductEvent(ProductDetails details) {
		super();
		this.details = details;
	}

	public ProductDetails getDetails() {
		return details;
	}
}
