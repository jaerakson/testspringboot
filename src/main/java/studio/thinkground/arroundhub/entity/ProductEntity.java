package studio.thinkground.arroundhub.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
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
}
