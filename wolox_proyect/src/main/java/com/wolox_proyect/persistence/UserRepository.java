package com.wolox_proyect.persistence;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.domain.repository.UserRepositoryInterface;
import com.wolox_proyect.persistence.crud.UserCrudRepository;
import com.wolox_proyect.persistence.entity.Foto;
import com.wolox_proyect.persistence.entity.Producto;
import com.wolox_proyect.persistence.entity.Usuario;
import com.wolox_proyect.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements UserRepositoryInterface{
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private UserMapper userMapper;


    public Optional<Usuario> getUsuario(int isUser){
        return userCrudRepository.findById(isUser);
    }

    @Override
    public List<User> getAll() {
        return userMapper.toUsers((List<Usuario>) userCrudRepository.findAll());
    }

    @Override
    public void saveAll(List<User> users) {

        try{
            List<Usuario> usuarios = userMapper.toUsuarios(users);
            userCrudRepository.saveAll(usuarios);
        }catch (Exception e ){
            System.out.println("exception: "+ e);
        }

    }

    @Override
    public void delete(int idUser){
        userCrudRepository.deleteById(idUser);
    }

}
