package service;

import models.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.ProdutosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {
    private final ProdutosRepository produtosRepository;

    @Autowired
    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public Produtos salvarProduto(Produtos produto) {
        return produtosRepository.save(produto);
    }

    public Optional<Produtos> findById(String id) {
        return produtosRepository.findById(id);

    }

    public List<Produtos> findByNome(String nome) {
        return produtosRepository.findByNome(nome);
    }


    public List<Produtos> findAll(){
        return produtosRepository.findAll();
    }

}
