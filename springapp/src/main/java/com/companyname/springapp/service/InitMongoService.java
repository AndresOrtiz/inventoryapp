package com.companyname.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.companyname.springapp.domain.Product;
import com.companyname.springapp.domain.Provider;
import com.companyname.springapp.domain.Store;

/**
 * Service for initializing MongoDB with sample data using {@link MongoTemplate}
 */
public class InitMongoService {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public void init() {
		// Drop existing collections
		mongoTemplate.dropCollection("product");
		mongoTemplate.dropCollection("provider");
		mongoTemplate.dropCollection("store");
		
		// Create new records
		Provider provider1 = new Provider();
		provider1.setName("Provider Test 1");
		provider1.setAddress("Address!");
		provider1.setEmail("provider@provider.com");
		provider1.setPhone("1111111");
		provider1.setId("1");
		
		Store store1 = new Store();
		store1.setAddress("Address!");
		store1.setId("Store 1");
		
		Product product1 = new Product();
		product1.setName("Producto Test 1");
		product1.setPrice(1000.0);
		product1.setAmount(1000.0);
		product1.setProvider(provider1);
		product1.setStore(store1);
		product1.setId("1");
		
		// Insert to db
		mongoTemplate.insert(provider1, "provider");
		mongoTemplate.insert(store1, "store");
		mongoTemplate.insert(product1, "product");
	}
	
}

