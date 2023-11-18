package Model;


import Repository.ProdutoRepository;
import Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

/** Teste:
 * curl -X POST -H "Content-Type: application/json" -d '{
 *   "nome": "Produto de Exemplo",
 *    "descricao": "desc de exemplo",
 *   "preco": 29.99
 * }' http://localhost:8080/api/products
 *
 */


 /*curl -X POST -H "Content-Type: application/json" -d '{
         "nome": "Produto1",
         "descricao": "desc de exemplo",
         "preco": 29.99
         }' http://localhost:8080/api/produtos*/

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
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/consultar/nome/{nome}")
    public ResponseEntity<List<Produto>> consultarProdutosNome(@PathVariable String nome) {
        List<Produto> produtos = produtoService.consultarPorNome(nome);
        if (!produtos.isEmpty()) {
            return ResponseEntity.ok(produtos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/consultar/id/{id}")
    public ResponseEntity<Produto> consultarProdutosId(@PathVariable String id) {
        Optional<Produto> produto = produtoService.findById(id);
        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/consultar/todos")
    public ResponseEntity<List<Produto>> consultarProdutos() {
        List<Produto> produtos = produtoService.findAll();
        if (!produtos.isEmpty()) {
            return ResponseEntity.ok(produtos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

