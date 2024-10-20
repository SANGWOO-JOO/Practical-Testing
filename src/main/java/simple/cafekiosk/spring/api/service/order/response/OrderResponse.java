package simple.cafekiosk.spring.api.service.order.response;

import jakarta.persistence.*;
import lombok.Getter;
import simple.cafekiosk.spring.api.service.product.response.ProductResponse;
import simple.cafekiosk.spring.domain.order.OrderStatus;
import simple.cafekiosk.spring.domain.orderproduct.OrderProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Getter
public class OrderResponse {

    private Long id;
    private int totalPrice;
    private LocalDateTime registeredDateTime;
    private List<ProductResponse> products;
}
