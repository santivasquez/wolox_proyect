package com.wolox_proyect.domain.services;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.domain.repository.AlbumRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    AlbumRepositoryInterface albumRepositoryInterface;

    public List<Album> getAll(){
        return albumRepositoryInterface.getAll();
    }

    public Optional<List<Album>> getByUserId(int userId){
        return  albumRepositoryInterface.getByuserId(userId);
    }

    public void saveAll(List<Album> albums){
        albumRepositoryInterface.saveAll(albums);
    }

}
