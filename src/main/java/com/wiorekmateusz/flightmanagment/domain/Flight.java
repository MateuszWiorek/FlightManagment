package com.wiorekmateusz.flightmanagment.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Flight {
    @GeneratedValue
    @Id
    private int flightId;
}
