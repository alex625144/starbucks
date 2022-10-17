package com.starbucks.repositary;

import com.starbucks.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//@Repository
public interface OrderRepositary extends CrudRepository<Order, UUID > {


}
