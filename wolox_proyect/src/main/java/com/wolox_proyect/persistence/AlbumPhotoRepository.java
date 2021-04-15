package com.wolox_proyect.persistence;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.repository.AlbumPhotoRepositoryInterface;
import com.wolox_proyect.persistence.crud.AlbumPhotoCrudRepository;
import com.wolox_proyect.persistence.entity.Foto;
import com.wolox_proyect.persistence.entity.Usuario;
import com.wolox_proyect.persistence.mapper.AlbumPhotoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumPhotoRepository implements AlbumPhotoRepositoryInterface {

    @Autowired
    AlbumPhotoCrudRepository albumPhotoCrudRepository;

    @Autowired
    AlbumPhotoMapper mapper;

    @Override
    public void saveAll(List<AlbumPhoto> albumPhotos) {

        List<Foto> albumPhotos1 = mapper.toFotos(albumPhotos);
        albumPhotoCrudRepository.saveAll(albumPhotos1);

    }
}
