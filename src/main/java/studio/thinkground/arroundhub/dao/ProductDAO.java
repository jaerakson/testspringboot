package studio.thinkground.arroundhub.dao;

import studio.thinkground.arroundhub.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}
