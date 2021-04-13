package com.wolox_proyect.web.controller;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId){
        productService.delete(productId);
    }

}
