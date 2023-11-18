package service;

import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProdutoRepository;

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