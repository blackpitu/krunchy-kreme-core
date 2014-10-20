package com.krunchykreme.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krunchykreme.core.services.ProductService;
import com.krunchykreme.events.product.CreateProductEvent;
import com.krunchykreme.events.product.ProductDetails;

@Controller
public class ProductCommandsController {
	@Autowired
	private ProductService productService ;
	
	
	@RequestMapping(value="/product/", method = RequestMethod.POST)
    @ResponseBody
    public ProductDetails addProduct(@RequestBody ProductDetails productDetails ) {
		CreateProductEvent createProductEvent = new CreateProductEvent(productDetails);
		return productService.createProduct(createProductEvent).getDetails();
	}
}
