package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.model.Status;
import com.starbucks.service.OrderService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class RestControllers {

    private final OrderService orderService;

    public RestControllers(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping()
    public String saveOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        return order.toString();
    }

    @PutMapping("/{id}")
    public String updateOrder(@RequestBody Order order, @PathVariable("id") UUID id) {

        try {
            orderService.existOrder(id);
        } catch (RuntimeException ex) {
            throw new ResourceAccessException("Order does not exist ");
        }
        orderService.updateOrder(order, id);
        return order.toString();
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") UUID id) {
        orderService.deleteOrdersById(id);
    }

    @PatchMapping("/{id}")
    public void patchOrder(@RequestBody Status status, @PathVariable("id") UUID id) {
        orderService.patchOrder(id, status);
    }
}
