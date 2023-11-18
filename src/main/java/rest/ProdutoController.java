package rest;

import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ProdutoRepository;
import service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoService produtoService;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
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

    @GetMapping
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

}