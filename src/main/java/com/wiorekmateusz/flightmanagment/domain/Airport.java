package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Airport {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private String location;

}
