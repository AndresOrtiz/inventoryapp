package com.companyname.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.companyname.springapp.domain.Provider;

public interface ProviderRepository extends MongoRepository<Provider, String> {
}
