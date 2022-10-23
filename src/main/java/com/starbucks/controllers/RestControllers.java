package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.model.Status;
import com.starbucks.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class RestControllers {

    private final OrderService orderService;

    public RestControllers(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping()
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable("id") UUID id) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") UUID id) {
        orderService.deleteOrdersById(id);
    }

    @PatchMapping("/{id}/status/")
    public Order patchOrder(@PathVariable("id") UUID id, @RequestParam("status") Status status) {
        return orderService.updateStatusOrder(id, status);
    }
}
