package com.ambev.projetopratico4.controller;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/salvar")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoService.salvarProduto(produto);
    }

    @GetMapping("/buscarPorId/{id}")
    public Optional<Produto> buscarPorId(@PathVariable String id) {
        return produtoService.buscarPorId(id);
    }

    @GetMapping("/buscarPorNome/{nome}")
    public List<Produto> buscarPorNome(@PathVariable String nome) {
        return produtoService.buscarPorNome(nome);
    }

    @GetMapping("/buscarTodos")
    public List<Produto> buscarTodos() {
        return produtoService.buscarTodos();
    }

}
