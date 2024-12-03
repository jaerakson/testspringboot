package studio.thinkground.arroundhub.data.handler;

import studio.thinkground.arroundhub.data.entity.ProductEntity;

public interface ProductDataHandler {
    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
    ProductEntity getProductEntity(String productId);
}
