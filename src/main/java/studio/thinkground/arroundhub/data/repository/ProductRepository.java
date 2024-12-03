package studio.thinkground.arroundhub.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.arroundhub.data.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
