package com.ambev.projetopratico4.controller;

import com.ambev.projetopratico4.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.findById(id);
    }

    @GetMapping("/search")
    public List<Product> getProductByName(@RequestParam String name) {
        return productService.findByName(name);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
}