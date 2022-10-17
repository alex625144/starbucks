package com.starbucks.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "Order", schema = "starbucks", catalog = "postgres")
public class Order {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "time", nullable = false)
    private Integer time;
    @Column(name = "beverages", nullable = false)
    private String beverages;
    @Column(name = "size", nullable = false)
    private String size;
    @Column(name = "sugar", nullable = false)
    private Integer sugar;

    public Order(Integer time , String beverage , String size , Integer sugar) {
    }

    @Override
    public String toString( ) {
        return "Order{" +
                "time=" + time +
                ", beverages='" + beverages + '\'' +
                ", size='" + size + '\'' +
                ", sugar=" + sugar +
                '}';
    }
}
