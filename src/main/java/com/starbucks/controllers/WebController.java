package com.starbucks.controllers;

import com.starbucks.model.Order;
import com.starbucks.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(method={RequestMethod.GET})
public class WebController{

    private final OrderService orderService;

    public WebController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/main")
    public String orderGet( ) {
        return "main.html";
    }

    @PostMapping("/main")
    public String orderPost(
            @RequestParam Integer time ,
            @RequestParam String beverage ,
            @RequestParam String size ,
            @RequestParam Integer sugar
    ) {
//        Order order = new Order ( time , beverage , size , sugar );
//        orderService.saveOrder ( order);
        return "success.html";
    }
}
