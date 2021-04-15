package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.AlbumPhoto;

import java.util.List;

public interface AlbumPhotoRepositoryInterface {

    void saveAll(List<AlbumPhoto> albumPhotos);

}
