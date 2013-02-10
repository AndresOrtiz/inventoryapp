package com.companyname.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.domain.Provider;
import com.companyname.springapp.repository.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository providerRepository;
		
	public Provider create(Provider provider) {
		return providerRepository.save(provider);
	}
	
	public Provider read(Provider provider) {
		return provider;
	}
	
	public List<Provider> readAll() {
		return providerRepository.findAll();
	}
	
	public Provider update(Provider provider) {
		Provider existingProvider = providerRepository.findOne(provider.getId());
		
		if (existingProvider == null) {
			return null;
		}
		
		return providerRepository.save(provider);
	}
	
	public Boolean delete(Provider provider) {
		Provider existingProvider = providerRepository.findOne(provider.getId());
		
		if (existingProvider == null) {
			return false;
		}
		
		providerRepository.delete(provider);
		return true;
	}
	
}

