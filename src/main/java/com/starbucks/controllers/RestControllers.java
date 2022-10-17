package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.repositary.Repositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class RestControllers {

    @Autowired
    private Repositary repositary;

    @PostMapping("/orders")
    public void storeOrder(@RequestBody Order order) {
        repositary.save ( order );
    }

    @PutMapping("/orders")
    public void updateOrder(@RequestBody Order order , @PathVariable("id") UUID id) {
        repositary.updateOrder ( order , id );
    }

    @DeleteMapping("/orders")
    public void deleteOrder(@PathVariable("id") UUID id) {
        repositary.deleteOrdersById ( id );

    }

    @PatchMapping("/orders")
    public void patchOrder(@RequestBody Order order) {
        repositary.save ( order );
    }

}
