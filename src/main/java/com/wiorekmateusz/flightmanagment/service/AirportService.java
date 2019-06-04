package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> getAll();
    Airport getAirportById(int id);
    void deleteAirport(int id);
    void deleteAll();
    void addAirport(Airport airport);
}
