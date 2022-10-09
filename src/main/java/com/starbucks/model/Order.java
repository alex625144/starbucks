package com.starbucks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String beverages;
    private String size;
    private Integer sugar;

    public Order(Integer time , String size , String beverage , Integer sugar) {
    }

    public Order( ) {

    }

    public long getId( ) {
        return id;
    }

    public void setId(long id) {
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
}
