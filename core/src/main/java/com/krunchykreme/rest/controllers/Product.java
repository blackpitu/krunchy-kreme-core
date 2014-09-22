package com.krunchykreme.rest.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krunchykreme.core.services.ProductEventHandler;
import com.krunchykreme.core.services.ProductService;
import com.krunchykreme.events.product.ProductDetails;
import com.krunchykreme.events.product.RequestProductDetailsEvent;
import com.krunchykreme.persistence.repository.ProductRepository;
import com.krunchykreme.persistence.services.ProductPersistenceEventHandler;

@Controller
public class Product {
	@Autowired
	private ProductService productService ;
	
	@RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
	
	@RequestMapping(value="/product/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ProductDetails getProduct(@PathVariable("id") int id) {
		RequestProductDetailsEvent requestProductDetailsEvent = new RequestProductDetailsEvent(id);
        return productService.requestProductDetails(requestProductDetailsEvent).getDetails();
    }
	
	@RequestMapping(value="/product/", method = RequestMethod.POST)
    @ResponseBody
    public ProductDetails addProduct() {
	}
}
