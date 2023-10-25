package javaprogramming.commonmistakes.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品价格
     */
    private Double productPrice;
    /**
     * 产品数量
     */
    private Integer productQuantity;
}
