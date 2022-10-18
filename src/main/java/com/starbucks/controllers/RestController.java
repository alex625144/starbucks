package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final OrderService orderService;

    public RestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public void storeOrder(@RequestBody Order order) {
        orderService.saveOrder ( order );
    }

    @PutMapping("/orders/{id}")
    public void updateOrder(@RequestBody Order order , @PathVariable("id") UUID id) {
        orderService.updateOrder ( order , id );
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") UUID id) {
        System.out.println ( id );
        orderService.deleteOrdersById ( id );
    }

    @PatchMapping("/orders")
    public void patchOrder(@RequestBody Order order) {
        orderService.saveOrder ( order );
    }
}
