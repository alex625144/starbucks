package com.starbucks.repositary;

import com.starbucks.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepositary extends CrudRepository < Order, UUID > {

    void saveOrder(Order order);

    List < Order > readOrders( );

    void updateOrder(Order order , UUID id);

    void deleteOrdersById(UUID id);
}
