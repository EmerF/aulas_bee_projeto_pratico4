package Repository;

import Model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
    List<Produto> findByNome(String nome);

    Optional<Produto> findById(String id);

    Produto save(Produto produto);
}
