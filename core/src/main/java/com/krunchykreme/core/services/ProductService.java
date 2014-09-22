package com.krunchykreme.core.services;

import com.krunchykreme.events.product.*;


public interface ProductService {
	ProductDetailsEvent requestProductDetails(RequestProductDetailsEvent requestProductDetailsEvent);
	ProductDetailsEvent createProduct(CreateProductEvent createProductEvent);
}
