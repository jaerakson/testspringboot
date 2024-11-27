package studio.thinkground.arroundhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.arroundhub.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
