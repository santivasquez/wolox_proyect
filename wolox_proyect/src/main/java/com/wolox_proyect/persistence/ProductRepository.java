package com.wolox_proyect.persistence;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.repository.ProductRepositoryInterface;
import com.wolox_proyect.persistence.crud.ProductCrudRepository;
import com.wolox_proyect.persistence.entity.Producto;
import com.wolox_proyect.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Component  generaliza que es un componente de Spring
@Repository
public class ProductRepository implements ProductRepositoryInterface {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByProductId(int idProduct) {
        List<Producto> productos = productCrudRepository.findByIdCategoriaOrderByNombreAsc(idProduct);
        return Optional.of(mapper.toProducts(productos));
    }

    public List<Producto> getByCategoria(int idCategoria){
        return  productCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<Producto> getProduct(int idProduct){
        return productCrudRepository.findById(idProduct);
    }

    @Override
    public Product save(Product product){
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productCrudRepository.save(producto));
    }

    public void delete(int idProduct){
        productCrudRepository.deleteById(idProduct);
    }

}
