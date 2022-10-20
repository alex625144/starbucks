package com.starbucks.service;

import com.starbucks.exception.ResourceNotFoundException;
import com.starbucks.model.Order;
import com.starbucks.model.Status;
import com.starbucks.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(UUID id, Order order) {
        Order orderDB = findById(id);
        orderDB.setBeverages(order.getBeverages());
        orderDB.setSize(order.getSize());
        orderDB.setSugar(order.getSugar());
        return orderRepository.save(orderDB);
    }

    public boolean existOrder(UUID id) {
        try {
            return orderRepository.existsById(id);
        } catch (RuntimeException ex) {
            throw new ResourceAccessException("Order does not exist");
        }
    }

    public void deleteOrdersById(UUID id) {
        orderRepository.deleteById(id);
    }

    public Order updateStatusOrder(UUID id, Status status) {
        Order orderDB = findById(id);
        orderDB.setStatus(status);
        return orderRepository.save(orderDB);
    }

    public Order findById(UUID id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> {
                    return new ResourceNotFoundException("Order does not found");
                });
    }
}

