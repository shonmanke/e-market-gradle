package com.jonathan.market.persistence.crud;

import com.jonathan.market.persistence.entity.Compra;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByIdCliente(String idCliente);
}
