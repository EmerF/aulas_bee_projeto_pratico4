package com.ambev.projetopratico4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.repository.ProdutoRepository;

@Service
public class ProdutoService {
   
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> consultarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }

    public List<Produto> consultarTodos() {
        return produtoRepository.findAll();
    }
}
