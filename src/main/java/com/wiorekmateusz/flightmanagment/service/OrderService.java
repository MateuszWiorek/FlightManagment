package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.OrderTicket;

import java.util.List;

public interface OrderService {
    List<OrderTicket> getAll();
    OrderTicket getOrderById(int id);
    void addOrder(OrderTicket orderTicket);
    void deleteOrder(int id);
}
