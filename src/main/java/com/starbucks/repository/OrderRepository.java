package com.starbucks.repository;

import com.starbucks.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository < Order, UUID > {

}
