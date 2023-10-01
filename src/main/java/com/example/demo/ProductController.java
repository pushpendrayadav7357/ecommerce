package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping

    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable Integer productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/category")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        return productRepository.findByCategory(category);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productRepository.deleteById(productId);
    }
}
