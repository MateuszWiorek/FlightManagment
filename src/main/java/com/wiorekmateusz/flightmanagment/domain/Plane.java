package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Plane {
    @GeneratedValue
    @Id
    private int planeId;
    private int size;
    private int reservedPlaces;
    private String name;
    @OneToMany(mappedBy="passengerId")
    List<Passenger> passengers;

}
