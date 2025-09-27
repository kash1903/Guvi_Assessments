package com.example.productManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productManagement.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
    
}
