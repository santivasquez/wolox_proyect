package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.User;

import java.util.List;

public interface UserRepositoryInterface {

    void saveAll(List<User> users);

    void delete(int idUser);

}
