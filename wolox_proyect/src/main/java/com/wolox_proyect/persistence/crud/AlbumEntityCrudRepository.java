package com.wolox_proyect.persistence.crud;

import com.wolox_proyect.persistence.entity.AlbumEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumEntityCrudRepository extends CrudRepository <AlbumEntity, Integer> {

    List<AlbumEntity> findByIdUser(int idUser);

}
