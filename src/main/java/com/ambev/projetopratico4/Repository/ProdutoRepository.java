package com.ambev.projetopratico4.Repository;

import com.ambev.projetopratico4.Model.Produto;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Produto findById(Long id);
    List<Produto> findByNome(String nome);
    List<Produto> findAll();
}

