package com.wolox_proyect.domain.services;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.repository.ProductRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepositoryInterface productRepositoryInterface;

    public List<Product> getAll(){
        return productRepositoryInterface.getAll();
    }

    /*public Optional<Product> getProduct(int productId){
        return productRepository.getByProductId(productId);
    }*/

    public Product save (Product product){
        return productRepositoryInterface.save(product);
    }

    public void delete(int productId){
        productRepositoryInterface.delete(productId);
    }

}
