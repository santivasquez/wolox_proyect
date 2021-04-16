package com.wolox_proyect.domain.repository;

import com.wolox_proyect.domain.Album;
import java.util.List;
import java.util.Optional;

public interface AlbumRepositoryInterface {

    List<Album> getAll();
    Optional<List<Album>> getByuserId(int userId);
    void saveAll(List<Album> albums);

}
