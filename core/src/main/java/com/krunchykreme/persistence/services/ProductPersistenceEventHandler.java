package com.krunchykreme.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunchykreme.events.product.CreateProductEvent;
import com.krunchykreme.events.product.ProductDetailsEvent;
import com.krunchykreme.events.product.RequestProductDetailsEvent;
import com.krunchykreme.persistence.domain.Product;
import com.krunchykreme.persistence.repository.ProductRepository;

@Service
public class ProductPersistenceEventHandler implements
		ProductPersistenceService {
	@Autowired
	private ProductRepository productRepository;

//	public ProductPersistenceEventHandler(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}

	public ProductDetailsEvent requestProductDetails(
			RequestProductDetailsEvent requestProductDetailsEvent) {
		
		Product product = productRepository.findOne(requestProductDetailsEvent
				.getKey());

		if (product == null) {
			return ProductDetailsEvent.notFound(requestProductDetailsEvent.getKey());
		}
		
		return new ProductDetailsEvent(
				requestProductDetailsEvent.getKey(),
				product.toProductDetails()
				);

	}

	public ProductDetailsEvent createProduct(
			CreateProductEvent createProductEvent) {
		// TODO Auto-generated method stub
		return null;
	}

}
