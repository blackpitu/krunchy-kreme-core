package com.krunchykreme.persistence.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunchykreme.events.product.CreateProductEvent;
import com.krunchykreme.events.product.ProductDetails;
import com.krunchykreme.events.product.ProductDetailsEvent;
import com.krunchykreme.events.product.RequestProductDetailsEvent;
import com.krunchykreme.persistence.domain.Product;
import com.krunchykreme.persistence.repository.ProductRepository;

@Service
public class ProductPersistenceEventHandler implements
		ProductPersistenceService {
	@Autowired
	private ProductRepository productRepository;
	
	@PersistenceContext
	@Autowired
	EntityManager entityManager;

	// public ProductPersistenceEventHandler(ProductRepository
	// productRepository) {
	// this.productRepository = productRepository;
	// }

	public ProductDetailsEvent requestProductDetails(
			RequestProductDetailsEvent requestProductDetailsEvent) {

		Product product = productRepository.findOne(requestProductDetailsEvent
				.getKey());

		if (product == null) {
			return ProductDetailsEvent.notFound(requestProductDetailsEvent
					.getKey());
		}

		return new ProductDetailsEvent(requestProductDetailsEvent.getKey(),
				product.toProductDetails());

	}

	public ProductDetailsEvent createProduct(
			CreateProductEvent createProductEvent) {
		Product product = new Product();
		ProductDetails productDetails = createProductEvent.getDetails();
		product.setDescription(productDetails.getDescription());
		product.setName(productDetails.getName());

		product = productRepository.save(product);
		entityManager.flush();

		return new ProductDetailsEvent(product.getId(),
				product.toProductDetails());
	}

}
