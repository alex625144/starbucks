package com.starbucks.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private Integer time;
    private String beverages;
    private String size;
    private Integer sugar;

    public Order(Integer time , String beverage , String size , Integer sugar) {
        this.id = UUID.randomUUID ( );
        this.time = time;
        this.beverages = beverage;
        this.size = size;
        this.sugar = sugar;
    }

    public Order( ) {
    }

    public Integer getTime( ) {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public UUID getId( ) {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBeverages( ) {
        return beverages;
    }

    public void setBeverages(String beverages) {
        this.beverages = beverages;
    }

    public String getSize( ) {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getSugar( ) {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString( ) {
        return "Order{" +
                "id=" + id +
                ", beverages='" + beverages + '\'' +
                ", time='" + time + '\'' +
                ", size='" + size + '\'' +
                ", sugar=" + sugar +
                '}';
    }
}
