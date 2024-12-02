package studio.thinkground.arroundhub.service.impl;

import org.springframework.stereotype.Service;
import studio.thinkground.arroundhub.dto.ProductDto;
import studio.thinkground.arroundhub.entity.ProductEntity;
import studio.thinkground.arroundhub.service.ProductService;

@Service
public class ProducntServiceimpl implements ProductService {
    ProductDataHandler productDataHandler ;

    this.productDataHandler =productDataHandler;

    @Override
    public ProductDto saveProduct( String productId, String productName, int productPrice, int productStock){
        ProductEntity productEntity = productDataHandler.saveProductEntity(  productId,   productName,   productPrice,   productStock);

        ProductDto productDto = new ProductDto(productEntity.getProductID() , productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());
        return productDto;
    }

    @Override
    public ProductDto getProduct(String productId){
        ProductEntity productEntity = new  productDataHandler.getProductEntity(productId);

        ProductDto productDto = new ProductDto(  productEntity.getProductID() , productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());

        return  ProductDto;
    }
}
