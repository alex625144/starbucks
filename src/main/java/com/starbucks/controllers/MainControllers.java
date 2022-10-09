package com.starbucks.controllers;

import com.starbucks.model.Order;

import com.starbucks.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainControllers {

    private final OrderService orderService;




    public MainControllers(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/")
    public String orderGet() { return "main.html"; }

    @PostMapping("/")
    public String orderPost(
            @RequestParam Integer time,
            @RequestParam String beverage,
            @RequestParam String size,
            @RequestParam Integer sugar
    ) {


        Order order = new Order (time,beverage, size, sugar);
        System.out.println (order.toString () );
        orderService.saveOrder( order );


        return "success.html";

    }


}
