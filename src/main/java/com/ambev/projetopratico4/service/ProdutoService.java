package com.ambev.projetopratico4.service;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Produto consultarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }
}
