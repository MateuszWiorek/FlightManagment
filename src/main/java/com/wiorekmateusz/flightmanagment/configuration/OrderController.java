package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.*;
import com.wiorekmateusz.flightmanagment.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("/order/")
public class OrderController {
    public final OrderService orderService;

    @GetMapping ("/getOrders/")
    public List<OrderTicket> getAll(){
        return orderService.getAll();
    }

    @GetMapping ("/getOrderById/{id}/")
    public OrderTicket getOrderdById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping ("/addOrder/")
    public void addOrder(@RequestBody OrderTicket order){
        orderService.addOrder(order);
    }

    @PostMapping ("deleteOrder/{id}/")
    public void deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
    }

}
