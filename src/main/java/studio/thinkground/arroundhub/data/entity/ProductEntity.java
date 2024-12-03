package studio.thinkground.arroundhub.data.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "product")
public class ProductEntity {
    @Id
    String productID;
    String productName;
    Integer productPrice;
    Integer productStock;

//    public ProductDto toDto(){
//        return ProductDto.builder();
//    }
}
