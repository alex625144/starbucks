package com.starbucks.repositary;

import com.starbucks.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositary {

    private final JdbcTemplate jdbc;

    public OrderRepositary(JdbcTemplate jdbc) {this.jdbc = jdbc;}


    public void saveOrder(Order order) {
        String sql = "INSERT INTO `Order` VALUES(?, ?,?,?,?)";
        jdbc.update ( sql,order.getId (),order.getTime(),order.getBeverages (),order.getSize (),order.getSugar () );
    }
}
