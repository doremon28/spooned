package tp.software.traceability.io.repositories;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tp.software.traceability.io.entities.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByName(String name);
}