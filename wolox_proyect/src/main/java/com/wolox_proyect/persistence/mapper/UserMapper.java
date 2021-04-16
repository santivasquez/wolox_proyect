package com.wolox_proyect.persistence.mapper;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.domain.User;
import com.wolox_proyect.persistence.entity.Producto;
import com.wolox_proyect.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")  // decimos que el mapper es de tipo Spring
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUser", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "userName", target = "username"),
            @Mapping(source = "email", target = "email")
    })

    User toUser (Usuario usuario);

    @InheritInverseConfiguration
    @Mapping(target="albumEntities", ignore = true)
    Usuario toUsuario (User user);


    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mapping(target="albumEntities", ignore = true)
    List<Usuario> toUsuarios(List<User> users);

}
