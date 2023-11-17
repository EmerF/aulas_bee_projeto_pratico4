package com.ambev.projetopratico4.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByName(String name);
}