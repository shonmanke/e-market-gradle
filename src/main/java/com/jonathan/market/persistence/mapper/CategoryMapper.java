package com.jonathan.market.persistence.mapper;

import com.jonathan.market.domain.Category;
import com.jonathan.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source ="idCategoria", target="categoryId"),
            @Mapping(source ="descripcion", target="category"),
            @Mapping(source ="estado", target="active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration //mapeo inverso al que ya tenemos
    @Mapping(target="productos", ignore = true)
    Categoria toCategoria(Category category);

}
