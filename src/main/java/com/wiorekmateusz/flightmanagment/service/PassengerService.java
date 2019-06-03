package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Passenger;

import java.util.List;

public interface PassengerService {
     List<Passenger> getPassengersList();
     Passenger getById(Integer id);
     void deletePassenger(Integer id);
     long countPassengers();
}
