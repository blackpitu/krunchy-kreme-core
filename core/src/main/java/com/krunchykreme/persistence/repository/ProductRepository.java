package com.krunchykreme.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krunchykreme.persistence.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}