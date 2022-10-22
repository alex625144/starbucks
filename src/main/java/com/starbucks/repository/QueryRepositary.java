package com.starbucks.repository;

import com.starbucks.model.Order;
import com.starbucks.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface QueryRepositary extends JpaRepository<Order, UUID> {

    @Query("SELECT o from Order o where o.status='READY'")
    List<Order> findAllActiveUser();

    @Query(value = "UPDATE Order o set o.status = o.status where o.id = o.id")
    Order update(UUID id, Status status);
}
