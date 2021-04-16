package com.wolox_proyect.domain.services;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.domain.repository.UserRepositoryInterface;
import com.wolox_proyect.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepositoryInterface userRepositoryInterface;

    public List<User> getAll(){
        return userRepositoryInterface.getAll();
    }

    public void saveAll (List<User> users){
        userRepositoryInterface.saveAll(users);
    }

    public void delete(int userId){
        userRepositoryInterface.delete(userId);
    }

}
