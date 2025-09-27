package com.example.productManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.productManagement.Model.Product;
import com.example.productManagement.Repository.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;
     
    // Display all products
    public ResponseEntity<?> getAllProducts() {
        // Implementation to fetch all products
        return ResponseEntity.ok(productRepo.findAll());
    }

    // Add a new product
    public ResponseEntity<?> addProduct(Product products) {

        return ResponseEntity.ok(productRepo.save(products));
    }
}
