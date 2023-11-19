package com.ambev.projetopratico4.service;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto create(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public List<Produto> getAll() {
        return this.produtoRepository.findAll();
    }

    public Optional<Produto> findById(String id){ return this.produtoRepository.findById(id); }

    public List<Produto> findByNome(String nome){ return this.produtoRepository.findByNome(nome); }
}
