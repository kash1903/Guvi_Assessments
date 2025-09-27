package com.example.productManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.productManagement.Model.Product;



@Controller
@CrossOrigin(origins = "*")
public class PageController {
    
    // @GetMapping("/")
    // public String home() {
    //     return "index"; 
    // }


    // @GetMapping("/view-products")
    // public String viewProducts() {
    //     return "view-products"; 
    // }

    // @GetMapping("/add-product")
    // public String addProductPage() {
    //     return "AddProduct";  
    // }

        private List<Product> products = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}
