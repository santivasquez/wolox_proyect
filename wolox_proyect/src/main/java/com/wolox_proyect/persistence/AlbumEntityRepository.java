package com.wolox_proyect.persistence;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.domain.repository.AlbumRepositoryInterface;
import com.wolox_proyect.persistence.crud.AlbumEntityCrudRepository;
import com.wolox_proyect.persistence.entity.AlbumEntity;
import com.wolox_proyect.persistence.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumEntityRepository implements AlbumRepositoryInterface {
    @Autowired
    AlbumEntityCrudRepository albumEntityCrudRepository;
    @Autowired
    AlbumMapper mapper;


    @Override
    public List<Album> getAll() {
        return mapper.toAlbums((List<AlbumEntity>) albumEntityCrudRepository.findAll());
    }

    @Override
    public Optional<List<Album>> getByuserId(int usrId) {
        List<AlbumEntity> albumEntities = albumEntityCrudRepository.findByIdUser(usrId);
        return Optional.of(mapper.toAlbums(albumEntities));
    }

    @Override
    public void saveAll(List<Album> albums) {
        List<AlbumEntity> albumEntities = mapper.toAlbumsEntity(albums);
        albumEntityCrudRepository.saveAll(albumEntities);
    }
}
