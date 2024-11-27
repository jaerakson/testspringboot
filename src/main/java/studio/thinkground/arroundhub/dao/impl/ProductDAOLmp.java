package studio.thinkground.arroundhub.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.arroundhub.dao.ProductDAO;
import studio.thinkground.arroundhub.entity.ProductEntity;
import studio.thinkground.arroundhub.repository.ProductRepository;

@Service
public class ProductDAOLmp implements ProductDAO {
    ProductRepository productRepository;


    @Autowired //자동으로 연결시켜준다 의미 (new 객체를 선언을 대신해준다)
    public ProductDAOLmp(ProductRepository productRepository){
        this.productRepository =productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
        return productEntity;
    }
    @Override
    public ProductEntity getProduct(String productId){
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }
}

// 8150 qausapi.universestationery.com  qausadmin.universestationery.com ELB-EN-QA
//  0.0.0.0:8150->80/tcp, :::8150->80/tcp, 0.0.0.0:1306->3306/tcp, :::1306->3306/tcp
// DB_HOST=172.17.0.4
//DB_PORT=3306