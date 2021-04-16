package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.domain.AlbumPhoto;

import java.util.List;

public interface AlbumPhotoRepositoryInterface {

    List<AlbumPhoto> getAll();
    void saveAll(List<AlbumPhoto> albumPhotos);

}
