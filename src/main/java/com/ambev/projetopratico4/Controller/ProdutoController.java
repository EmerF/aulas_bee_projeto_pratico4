package com.ambev.projetopratico4.Controller;

import com.ambev.projetopratico4.Model.Produto;
import com.ambev.projetopratico4.Repository.ProdutoRepository;
import com.ambev.projetopratico4.Service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoService produtoService;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping("/salvar")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @GetMapping("/name")
    public List<Produto> findByName(@RequestParam String nome) {
        return produtoRepository.findByNome(nome);
    }

    @GetMapping("/all")
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

}
