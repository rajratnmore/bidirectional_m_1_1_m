package com.geekster.bidirectional_m_1_1_m.controller;

import com.geekster.bidirectional_m_1_1_m.model.Order;
import com.geekster.bidirectional_m_1_1_m.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("order")
    public String addOrder(@RequestBody Order newOrder){
        return orderService.addOrder(newOrder);
    }
}
