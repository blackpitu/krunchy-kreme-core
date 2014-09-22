package com.krunchykreme.persistence.services;

import com.krunchykreme.events.product.CreateProductEvent;
import com.krunchykreme.events.product.ProductDetailsEvent;
import com.krunchykreme.events.product.RequestProductDetailsEvent;

public interface ProductPersistenceService {
	ProductDetailsEvent requestProductDetails(RequestProductDetailsEvent requestProductEvent);
	ProductDetailsEvent createProduct(CreateProductEvent createProductEvent);
}
