package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryInterface {
    List<Product> getAll();
    Optional<List<Product>> getByProductId(int idProduct);
    Product save(Product product);
    void delete(int idProduct);
}
