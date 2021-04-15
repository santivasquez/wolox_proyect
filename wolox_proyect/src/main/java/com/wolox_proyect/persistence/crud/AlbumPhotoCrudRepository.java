package com.wolox_proyect.persistence.crud;

import com.wolox_proyect.persistence.entity.Foto;
import org.springframework.data.repository.CrudRepository;

public interface AlbumPhotoCrudRepository extends CrudRepository <Foto, Integer> {
}
