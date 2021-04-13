package com.wolox_proyect.web.controller;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product>getAll(){
        return productService.getAll();
    }

    public Product save(Product product){
        return productService.save(product);
    }

    public void delete(int productId){
        productService.delete(productId);
    }

}
