package com.wolox_proyect.persistence.crud;

import com.wolox_proyect.persistence.entity.Producto;
import com.wolox_proyect.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCrudRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByidUserOrderByNombreAsc(int idUser);

}
