package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
public class Passenger {
    @GeneratedValue
    @Id
    private int passengerId;
    private String firstName;
    private String lastName;
    private String name;
    @ManyToOne
    private Plane plane;

}
