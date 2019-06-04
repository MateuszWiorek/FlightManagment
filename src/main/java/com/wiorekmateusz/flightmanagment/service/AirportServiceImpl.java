package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Airport;
import com.wiorekmateusz.flightmanagment.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("airportService")
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {
    AirportRepository airportRepository;
    @Override
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(int id) {
        Airport airport;
        Optional<Airport> c =airportRepository.findById(id);
        if(checkAirport(c, id)){
            airport = c.get();
            return airport;
        }
        return null;
    }

    @Override
    public void deleteAirport(int id) {
        Optional<Airport> c = airportRepository.findById(id);
        if(checkAirport(c, id)){
            airportRepository.deleteById(id);
        }

    }

    @Override
    public void deleteAll() {
        airportRepository.deleteAll();

    }

    @Override
    public void addAirport(Airport airport) {
        airportRepository.saveAndFlush(airport);
    }

    private boolean checkAirport(Optional<Airport> c, Integer id) {
        return id != null && c.isPresent();
    }
}
