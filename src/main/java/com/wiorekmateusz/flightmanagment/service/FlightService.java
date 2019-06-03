package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Flight;
import com.wiorekmateusz.flightmanagment.domain.Passenger;
import com.wiorekmateusz.flightmanagment.domain.Plane;

import java.util.List;

public interface FlightService {
    List<Flight> getAllFlights();
    Flight getFlightById(int id);
    void deleteFligght(int id);
    void makeReservation( Plane plane, int places);
}
