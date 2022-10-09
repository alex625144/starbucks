package com.starbucks.service;


import com.starbucks.model.Order;
import com.starbucks.repositary.OrderRepositary;

import java.util.Optional;

public class OrderService {

    private Order order;
    private OrderRepositary repo = new OrderRepositary ( ) {
        @Override
        public < S extends Order > S save(S entity) {
            return null;
        }

        @Override
        public < S extends Order > Iterable < S > saveAll(Iterable < S > entities) {
            return null;
        }

        @Override
        public Optional < Order > findById(Long aLong) {
            return Optional.empty ( );
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable < Order > findAll( ) {
            return null;
        }

        @Override
        public Iterable < Order > findAllById(Iterable < Long > longs) {
            return null;
        }

        @Override
        public long count( ) {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Order entity) {

        }

        @Override
        public void deleteAllById(Iterable < ? extends Long > longs) {

        }

        @Override
        public void deleteAll(Iterable < ? extends Order > entities) {

        }

        @Override
        public void deleteAll( ) {

        }
    };

    public OrderService(Order order){

        System.out.println (order.toString () );
        repo.save ( order );
    }

}
