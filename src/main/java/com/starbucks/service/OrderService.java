package com.starbucks.service;

import com.starbucks.model.Order;
import com.starbucks.model.Status;
import com.starbucks.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String saveOrder(Order order) {
        orderRepository.save(order);
        return order.toString();
    }

    public String updateOrder(UUID id, Order order) {
        Order orderDB = orderRepository.findById(id).get();
        orderDB.setBeverages(order.getBeverages());
        orderDB.setSize(order.getSize());
        orderDB.setSugar(order.getSugar());
        orderRepository.save(orderDB);
        return "Order updated!";
    }

    public boolean existOrder(UUID id) {
        return orderRepository.existsById(id);
    }

    public void deleteOrdersById(UUID id) {
        orderRepository.deleteById(id);
    }

    public String updateStatusOrder(UUID id, Status status) {
        Order ordeDB = orderRepository.findById(id).get();
        ordeDB.setStatus(status);
        orderRepository.save(ordeDB);
        return "Status changed to " + status.toString();
    }
}
