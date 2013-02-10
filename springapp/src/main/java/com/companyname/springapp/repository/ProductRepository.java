package com.companyname.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.companyname.springapp.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
