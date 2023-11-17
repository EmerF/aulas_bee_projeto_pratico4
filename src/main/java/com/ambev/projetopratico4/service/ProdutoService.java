package com.ambev.projetopratico4.service;

import com.ambev.projetopratico4.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
class ProductService {
    private ProductRepository productRepository;

    public void ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        // Add logic to save the product to the MongoDB database
        return productRepository.save(product);
    }

    public Product findById(String id) {
        // Add logic to retrieve a product by ID from the MongoDB database
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findByName(String name) {
        // Add logic to retrieve products by name from the MongoDB database
        return productRepository.findByName(name);
    }

    public List<Product> findAll() {
        // Add logic to retrieve all products from the MongoDB database
        return productRepository.findAll();
    }
}