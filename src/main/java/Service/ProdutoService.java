package Service;

import Model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public Optional<Produto> findById(String id) { return produtoRepository.findById(id); }
    public List<Produto> consultarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto) { return produtoRepository.save(produto); }

}