package com.ambev.projetopratico4.repository;
import com.ambev.projetopratico4.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Produto findById(Long id);
    List<Produto> findByNome(String nome);
    List<Produto> findAll();
}
