package com.starbucks.repositary;

import com.starbucks.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public abstract class Repositary implements OrderRepositary {
    @Override
    public void saveOrder(Order order) {
        save ( order );

    }

    @Override
    public List < Order > readOrders( ) {
        return (List < Order >) findAll ( );

    }

    @Override
    public void updateOrder(Order order , UUID id) {
        deleteOrdersById ( id );
        saveOrder ( order );
    }

    @Override
    public void deleteOrdersById(UUID id) {
        deleteOrdersById ( id );
    }
}
