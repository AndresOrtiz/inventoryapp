package com.companyname.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.domain.Product;
import com.companyname.springapp.repository.ProductRepository;
import com.companyname.springapp.repository.ProviderRepository;
import com.companyname.springapp.repository.StoreRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProviderRepository providerRepository;
	
	@Autowired
	private StoreRepository storeRepository;
		
	public Product create(Product product) {
		return productRepository.save(product);
	}
	
	public Product read(Product product) {
		return product;
	}
	
	public List<Product> readAll() {
		return productRepository.findAll();
	}
	
	public Product update(Product product) {
		Product existingProduct = productRepository.findOne(product.getId());
		
		if (existingProduct == null) {
			return null;
		}
		
		return productRepository.save(product);
	}
	
	public Boolean delete(Product product) {
		Product existingProduct = productRepository.findOne(product.getId());
		
		if (existingProduct == null) {
			return false;
		}
		
		productRepository.delete(existingProduct);
		return true;
	}
	
}

