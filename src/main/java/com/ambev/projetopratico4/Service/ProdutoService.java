package com.ambev.projetopratico4.Service;

import com.ambev.projetopratico4.Model.Produto;
import com.ambev.projetopratico4.Repository.ProdutoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Produto> findByName(String nome) {
        return produtoRepository.findByNome(nome);
    }
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

}
