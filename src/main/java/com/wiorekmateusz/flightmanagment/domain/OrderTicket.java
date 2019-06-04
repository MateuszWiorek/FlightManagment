package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderTicket {
    @GeneratedValue
    @Id
    private int orderId;
    private int flightNumber;
    private int PassengerNumber;
    private int price;


}
