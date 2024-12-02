package studio.thinkground.arroundhub.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import studio.thinkground.arroundhub.dao.ProductDAO;
import studio.thinkground.arroundhub.entity.ProductEntity;
import studio.thinkground.arroundhub.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerimpl implements ProductDataHandler {
    ProductDAO productDAO;
    @Autowired
    public ProductDataHandler(ProductDAO productDAO ) {
        this.productDAO = productDAO;
    }
    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock){

        ProductEntity productEntity = new ProductEntity( productId,   productName,   productPrice,   productStock );
        return ProductDAO.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(String productId){
        return productDAO.getProduct(productId);
    }
}
