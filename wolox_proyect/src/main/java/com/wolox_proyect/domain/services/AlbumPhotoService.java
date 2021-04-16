package com.wolox_proyect.domain.services;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.repository.AlbumPhotoRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumPhotoService {

    @Autowired
    AlbumPhotoRepositoryInterface albumPhotoRepositoryInterface;

    public List<AlbumPhoto> getAll(){
        return albumPhotoRepositoryInterface.getAll();
    }

    public void saveAll(List<AlbumPhoto> albumPhotos){
        albumPhotoRepositoryInterface.saveAll(albumPhotos);
    }

}
