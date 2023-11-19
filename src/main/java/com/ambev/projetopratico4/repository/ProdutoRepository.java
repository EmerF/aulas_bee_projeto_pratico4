package com.ambev.projetopratico4.repository;

import com.ambev.projetopratico4.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

    Optional<Produto> findById(String id);

    List<Produto> findByNome(String nome);

}

