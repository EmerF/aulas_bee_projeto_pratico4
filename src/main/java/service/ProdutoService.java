package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarPorId(String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto buscarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }
}

