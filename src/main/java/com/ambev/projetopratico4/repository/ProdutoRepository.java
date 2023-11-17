package com.ambev.projetopratico4.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ambev.projetopratico4.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}