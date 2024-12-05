package studio.thinkground.arroundhub.data.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import studio.thinkground.arroundhub.data.dao.ProductDAO;
import studio.thinkground.arroundhub.data.entity.ProductEntity;
import studio.thinkground.arroundhub.data.handler.ProductDataHandler;

@Service
@Transactional
@Component
@Repository
public class ProductDataHandlerimpl implements ProductDataHandler {
    ProductDAO productDAO; // 데이터 저장을 위해..

    @Autowired  
    public ProductDataHandlerimpl(ProductDAO productDAO ) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock){

        ProductEntity productEntity = new ProductEntity( productId,   productName,   productPrice,   productStock ); //각각의 값을 받아서 엔티티로 생성
        return productDAO.saveProduct(productEntity);//  productEntity를 DAO 쪽으로 넘겨줘서 저장하도록 함
    }

    @Override
    public ProductEntity getProductEntity(String productId){
        return productDAO.getProduct(productId);
    }
}
