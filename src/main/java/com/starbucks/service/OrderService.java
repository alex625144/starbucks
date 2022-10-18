package com.starbucks.service;

import com.starbucks.model.Order;
import com.starbucks.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveOrder(Order order) {
        orderRepository.save ( order );
    }

    public String updateOrder(Order order , UUID id) {
        if (orderRepository.existsById ( id )) {
            Order orderDB = orderRepository.findById ( id ).get ( );
            orderDB.setBeverages ( order.getBeverages ( ) );
            orderDB.setSize ( order.getSize ( ) );
            orderDB.setSugar ( order.getSugar ( ) );
            orderRepository.save ( orderDB );
        }
        return "Order " + id + " not exist";

    }

    public void deleteOrdersById(UUID id) {
        orderRepository.deleteById ( id );
    }
}
