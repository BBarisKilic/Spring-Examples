package com.baris.mongorestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.baris.mongorestapi.entity.Kullanici;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> {

}
