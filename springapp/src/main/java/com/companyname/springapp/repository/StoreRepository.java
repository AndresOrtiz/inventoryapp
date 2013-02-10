package com.companyname.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.companyname.springapp.domain.Store;

public interface StoreRepository extends MongoRepository<Store, String> {
}
