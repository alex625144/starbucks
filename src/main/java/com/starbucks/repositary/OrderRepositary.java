package com.starbucks.repositary;

import com.starbucks.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositary  extends CrudRepository< Order, Long> {

}
