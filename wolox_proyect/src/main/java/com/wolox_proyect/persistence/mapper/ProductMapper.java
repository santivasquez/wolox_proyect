package com.wolox_proyect.persistence.mapper;

import com.wolox_proyect.domain.Product;
import com.wolox_proyect.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")  // decimos queel mapper es de tipo Spring
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProdcut", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "salePrice", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "estado", target = "active")
    })

    Product toProducto(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration        // se le dice que haga el mapeo inverso al anterior
    @Mapping(target = "barCode", ignore = true) // para que ignore el campo de código d ebarras
    Producto toProduct(Product product);
}
