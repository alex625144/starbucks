package com.starbucks.repository;

import com.starbucks.model.Order;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends org.springframework.data.repository.CrudRepository < Order, UUID > {

}
