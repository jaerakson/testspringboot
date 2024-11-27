package studio.thinkground.arroundhub.dto;

import lombok.*;
import org.springframework.context.annotation.Bean;
import studio.thinkground.arroundhub.entity.ProductEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
            .productId(productId)
            .productName(productName)
            .productId(productPrice)
            .productName(productStock)
            .build();
    }
}
