package rest;

import Repository.ProdutosRepository;
import models.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProdutosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    private final ProdutosRepository produtosRepository;
    @Autowired
    private ProdutosService produtosService;

    @Autowired
    public ProdutosController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    @PostMapping
    public Produtos salvarProdutos(@RequestBody Produtos produtos) {
        return produtosRepository.save(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtos> buscarProdutosId(@PathVariable String id) {
        Optional<Produtos> produtos = produtosService.findById(id);
        if (produtos.isPresent()) {
            return ResponseEntity.ok(produtos.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Produtos>> buscarProdutosNome(@PathVariable String nome) {
        List<Produtos> produtos = produtosService.findByNome(nome);
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Produtos>> buscarProdutos() {
        List<Produtos> produtos = produtosService.findAll();
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
