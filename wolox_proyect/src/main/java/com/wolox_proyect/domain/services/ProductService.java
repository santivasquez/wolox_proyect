package com.wolox_proyect.domain.services;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    /*public Optional<Product> getProduct(int productId){
        return productRepository.getByProductId(productId);
    }*/

    public Product save (Product product){
        return productRepository.save(product);
    }

    public void delete(int productId){
        productRepository.delete(productId);
    }

}
