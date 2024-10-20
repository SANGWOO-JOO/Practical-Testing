package simple.cafekiosk.spring.api.controller.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import simple.cafekiosk.spring.api.controller.order.request.OrderCreateRequest;
import simple.cafekiosk.spring.api.service.order.OrderService;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private OrderService orderService;

    @PutMapping("/api/v1/orders/new")
    public void createOrder(@RequestBody OrderCreateRequest request){
        orderService.createOrder(request);
    }
}
