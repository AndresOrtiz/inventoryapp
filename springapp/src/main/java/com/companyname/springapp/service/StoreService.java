package com.companyname.springapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.domain.Store;
import com.companyname.springapp.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;
		
	public Store create(Store store) {		
		return storeRepository.save(store);
	}
	
	public Store read(Store store) {
		return store;
	}
	
	public List<Store> readAll() {
		return storeRepository.findAll();
	}
	
	public Store update(Store store) {
		Store existingStore = storeRepository.findOne(store.getId());
		
		if (existingStore == null) {
			return null;
		}
		
		return storeRepository.save(store);
	}
	
	public Boolean delete(Store store) {
		Store existingStore = storeRepository.findOne(store.getId());
		
		if (existingStore == null) {
			return false;
		}
		
		storeRepository.delete(store);
		return true;
	}
	
}

