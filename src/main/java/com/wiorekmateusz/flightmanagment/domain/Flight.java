package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Flight {
    @GeneratedValue
    @Id
    private int flightId;
    @OneToOne(targetEntity = Airport.class, fetch = FetchType.EAGER)
    private Airport startingAirport;
    @OneToOne(targetEntity = Airport.class, fetch = FetchType.EAGER)
    private Airport destination;
}
