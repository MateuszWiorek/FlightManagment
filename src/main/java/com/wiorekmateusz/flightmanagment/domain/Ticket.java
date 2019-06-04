package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Data
@Entity
public class Ticket {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private int numberOfPlaces;
    private double totalPrice;
    private int flightId;

}
