package studio.thinkground.arroundhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studio.thinkground.arroundhub.dto.ProductDto;

@RestController
@RequestMapping("/avi/v1/product-api")
public class ProductController {

    private ProductService   productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService =productService;
    }

    @GetMapping(value = "/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }

    @PostMapping(value = "/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return  productDto.saveProduct(productId,productName,productPrice,productStock) ;
    }
    @DeleteMapping(value = "/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId){return null;}
}
