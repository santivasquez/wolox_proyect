package com.wolox_proyect.persistence.mapper;

import com.wolox_proyect.domain.Album;
import com.wolox_proyect.persistence.entity.AlbumEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses ={UserMapper.class})
public interface AlbumMapper {
    @Mappings({
            @Mapping(source = "idAlbum", target = "id"),
            @Mapping(source = "idUser", target = "userId"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "usuario", target = "user")
    })
    Album toAlbum (AlbumEntity albumEntity);

    @InheritInverseConfiguration
    AlbumEntity toAlbumEntity (Album album);


    List<Album> toAlbums(List<AlbumEntity> albumEntities);

    @InheritInverseConfiguration
    List<AlbumEntity> toAlbumsEntity(List<Album> albums);
}
