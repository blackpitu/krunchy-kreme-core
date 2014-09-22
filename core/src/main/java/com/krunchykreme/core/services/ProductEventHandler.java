package com.krunchykreme.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunchykreme.events.product.CreateProductEvent;
import com.krunchykreme.events.product.ProductDetailsEvent;
import com.krunchykreme.events.product.RequestProductDetailsEvent;
import com.krunchykreme.persistence.services.ProductPersistenceService;

@Service
public class ProductEventHandler implements ProductService{
	@Autowired
	private ProductPersistenceService productPersistenceService;
	
//	@Autowired
//	public ProductEventHandler(
//			ProductPersistenceService productPersistenceService) {
//		this.productPersistenceService = productPersistenceService;
//	}

	public ProductDetailsEvent requestProductDetails(
			RequestProductDetailsEvent requestProductDetailsEvent) {
		return productPersistenceService.requestProductDetails(requestProductDetailsEvent);
	}

	public ProductDetailsEvent createProduct(
			CreateProductEvent createProductEvent) {
		return productPersistenceService.createProduct(createProductEvent);
	}

}
