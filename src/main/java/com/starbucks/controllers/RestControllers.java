package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.repositary.OrderRepositary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/order")
public class RestControllers {

    private final OrderRepositary orderRepositary;

    public RestControllers(OrderRepositary orderRepositary) {
        this.orderRepositary = orderRepositary;
    }

    @PostMapping
    public void storeOrder(@RequestBody Order order) {
        order.toString ( );
        orderRepositary.save( order );
    }
}
