package com.ambev.projetopratico4.rest;

import com.ambev.projetopratico4.model.Produto;
import com.ambev.projetopratico4.repository.ProdutoRepository;
import com.ambev.projetopratico4.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto) {
        Produto produtoExistente = produtoService.consultarPorNome(produto.getNome());
        if (produtoExistente != null) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Produto já cadastrado");
        }
        Produto produtoSalvo = produtoService.salvarProduto(produto);
        return new ResponseEntity<>(produtoSalvo, HttpStatus.CREATED);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Produto> consultarProdutoPorId(@PathVariable String id) {
        Produto produto = produtoService.findById(id).orElse(null);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/findByName/{nome}")
        public ResponseEntity<Produto> consultarProdutoPorNome(@PathVariable String nome) {
        Produto produto = produtoService.consultarPorNome(nome);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Produto>> consultarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/error")
    public ResponseEntity errorProduct() {
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }
}
