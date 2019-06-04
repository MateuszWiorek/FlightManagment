package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.OrderTicket;
import com.wiorekmateusz.flightmanagment.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("orderService")
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository;
    @Override
    public List<OrderTicket> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public OrderTicket getOrderById(int id) {
        OrderTicket order;
        Optional<OrderTicket> c = orderRepository.findById(id);
        if (checkOrder(c, id)){
            order=c.get();
            return order;
        }
        return null;
    }

    @Override
    public void addOrder(OrderTicket orderTicket) {
        orderRepository.saveAndFlush(orderTicket);

    }

    @Override
    public void deleteOrder(int id) {
        OrderTicket order;
        Optional<OrderTicket> c = orderRepository.findById(id);
        if (checkOrder(c, id)){
            orderRepository.deleteById(id);
        }

    }
    private boolean checkOrder(Optional<OrderTicket> c, Integer id) {
        return id != null && c.isPresent();
    }
}
