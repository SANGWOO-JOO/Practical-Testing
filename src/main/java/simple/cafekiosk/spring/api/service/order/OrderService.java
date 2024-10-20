package simple.cafekiosk.spring.api.service.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import simple.cafekiosk.spring.api.controller.order.request.OrderCreateRequest;
import simple.cafekiosk.spring.api.service.order.response.OrderResponse;
import simple.cafekiosk.spring.domain.product.ProductRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final ProductRepository productRepository;

    public OrderResponse createOrder(OrderCreateRequest request) {
        List<String> productNumbers = request.getProductNumbers();
        //Product

        //Order

        return null;
    }
}
