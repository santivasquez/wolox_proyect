package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.User;

import java.util.List;

public interface UserRepositoryInterface {

    List<User> getAll();
    void saveAll(List<User> users);

    void delete(int idUser);

}
