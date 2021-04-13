package com.wolox_proyect.persistence.crud;

import com.wolox_proyect.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


}
