package com.wolox_proyect.persistence.mapper;

import com.wolox_proyect.domain.AlbumPhoto;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.persistence.entity.Foto;
import com.wolox_proyect.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")  // decimos que el mapper es de tipo Spring
public interface AlbumPhotoMapper {
    @Mappings({
            @Mapping(source = "idFoto", target = "id"),
            @Mapping(source = "albumId", target = "albumId"),
            @Mapping(source = "titulo", target = "tittle"),
            @Mapping(source = "url", target = "url"),
            @Mapping(source = "thumbnail", target = "thumbnail")
    })
    AlbumPhoto toAlbumPhoto (Foto foto);

    @InheritInverseConfiguration
    Foto toFoto (AlbumPhoto albumPhoto);


    List<AlbumPhoto> toAlbumPhoto(List<Foto> fotos);

    @InheritInverseConfiguration
    List<Foto> toFotos(List<AlbumPhoto> albumPhotos);


}
