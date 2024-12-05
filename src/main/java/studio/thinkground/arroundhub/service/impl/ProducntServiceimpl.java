package studio.thinkground.arroundhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.arroundhub.data.dto.ProductDto;
import studio.thinkground.arroundhub.data.entity.ProductEntity;
import studio.thinkground.arroundhub.data.handler.ProductDataHandler;
import studio.thinkground.arroundhub.service.ProductService;

@Service // 본체라서 서비스 이노테이션 설정

public class ProducntServiceimpl implements ProductService {
    ProductDataHandler productDataHandler ; // 데이터를 핸들링이 필요할겨우 만듬

    @Autowired // 생성자를 지정해서 의존성 주입 값을 받을수 있도록 한다.
    public ProducntServiceimpl(ProductDataHandler productDataHandler){
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDto saveProduct( String productId, String productName, int productPrice, int productStock){
        ProductEntity productEntity = productDataHandler.saveProductEntity( productId,productName,productPrice,productStock); // 핸들로에서 데이터 처리후 엔티티로 받아서

        ProductDto productDto = new ProductDto(productEntity.getProductID() , productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock()); //DTO 변환작업
        return productDto; //  Controller 에서는 DTO 값을 받아야 해서..
    }

    @Override
    public ProductDto getProduct(String productId){
        
      Product product = productDataHandler.getProductEntity(productId);

     ProductDto productDto = new ProductDto(product.getId(), product.getName(), product.getPrice(), product.getStock());
     product.

    return productDto;
    }
}
