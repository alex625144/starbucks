package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.repositary.OrderRepositary;
import com.starbucks.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class MainControllers {

    @GetMapping("/")
    public String orderGet() { return "main.html"; }

    @PostMapping("/")
    public String orderPost(
            @RequestParam Integer time,
            @RequestParam String beverage,
            @RequestParam String size,
            @RequestParam Integer sugar
    ) {

        Order order = new Order (time, size, beverage , sugar);

        repo.save ( order );
        return "success.html";
    }


}
