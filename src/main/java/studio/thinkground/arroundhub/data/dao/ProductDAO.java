package studio.thinkground.arroundhub.data.dao;
import studio.thinkground.arroundhub.data.entity.ProductEntity;


public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity); // 엔티티값을 리턴 한다.
    ProductEntity getProduct(String productId) ;
}
