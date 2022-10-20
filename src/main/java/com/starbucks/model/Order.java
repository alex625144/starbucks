package com.starbucks.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
@Table(name = "Order", schema = "starbucks", catalog = "postgres")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "time")
    private int time;

    @Column(name = "beverages")
    private String beverages;

    @Column(name = "size")
    private String size;

    @Column(name = "sugar")
    private int sugar;

    @Enumerated(EnumType.STRING)
    @Column(name = "statusOrder")
    private Status status;
}
