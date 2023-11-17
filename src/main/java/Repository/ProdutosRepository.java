package Repository;

import models.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutosRepository  extends MongoRepository<Produtos, String> {
    Optional<Produtos> findById(String id);
    List<Produtos> findByNome(String nome);
    List<Produtos> findAll();


}