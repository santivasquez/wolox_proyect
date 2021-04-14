package com.wolox_proyect.persistence;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.persistence.crud.UserCrudRepository;
import com.wolox_proyect.persistence.entity.Producto;
import com.wolox_proyect.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    UserCrudRepository userCrudRepository;

    public Iterable<Usuario> saveAll(List<Usuario> usuarios){
        return userCrudRepository.saveAll(usuarios);
    }

    public void delete(int idUser){
        userCrudRepository.deleteById(idUser);
    }

}
