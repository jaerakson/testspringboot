package studio.thinkground.arroundhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import studio.thinkground.arroundhub.entity.ProductEntity;

@NoRepositoryBean
public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
