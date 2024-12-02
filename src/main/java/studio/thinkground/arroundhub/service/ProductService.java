package studio.thinkground.arroundhub.service;

import studio.thinkground.arroundhub.dto.ProductDto;

public interface ProductService {
    ProductDto saveProduct( String productId, String productName, int productPrice, int productStock);
    ProductDto getProduct(String productId);
}
