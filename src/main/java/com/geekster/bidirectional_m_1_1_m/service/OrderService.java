package com.geekster.bidirectional_m_1_1_m.service;

import com.geekster.bidirectional_m_1_1_m.model.Order;
import com.geekster.bidirectional_m_1_1_m.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(Order newOrder) {
        orderRepo.save(newOrder);
        return "added order";
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
