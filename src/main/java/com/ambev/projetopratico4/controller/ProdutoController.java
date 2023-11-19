package com.ambev.projetopratico4.controller;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.repository.ProdutoRepository;
import com.ambev.projetopratico4.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return this.produtoService.create(produto);
    }

    @GetMapping("/consultar")
    public List<Produto> getAll() {
        return this.produtoService.getAll();
    }

    @GetMapping("consultar/id/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable String id) {
        Optional<Produto> produto = produtoService.findById(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("consultar/nome/{nome}")
    public ResponseEntity<List<Produto>> findByNome(@PathVariable String nome) {
        List<Produto> produto = produtoService.findByNome(nome);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
