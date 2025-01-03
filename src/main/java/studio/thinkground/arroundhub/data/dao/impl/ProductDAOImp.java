package studio.thinkground.arroundhub.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.arroundhub.data.dao.ProductDAO;
import studio.thinkground.arroundhub.data.entity.ProductEntity;
import studio.thinkground.arroundhub.data.repository.ProductRepository;


@Service
public class ProductDAOImp implements ProductDAO {

    ProductRepository productRepository;
    @Autowired //자동으로 연결시켜준다 의미 (new 객체를 선언을 대신해준다)
    public ProductDAOImp(ProductRepository productRepository){
        this.productRepository =productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId){
        ProductEntity productEntity;
        productEntity = productRepository.getReferenceById(productId);
        return  productEntity ;
    }
}