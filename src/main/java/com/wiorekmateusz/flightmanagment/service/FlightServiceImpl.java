package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Flight;
import com.wiorekmateusz.flightmanagment.domain.Passenger;
import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.repository.FlightRepository;
import com.wiorekmateusz.flightmanagment.repository.PassengerRepository;
import com.wiorekmateusz.flightmanagment.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("flightService")
public class FlightServiceImpl implements FlightService {
    FlightRepository flightRepository;
    PassengerRepository passengerRepository;
    PlaneRepository planeRepository;
    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(int id) {
        Optional<Flight> c =flightRepository.findById(id);
        if(checkFlight(c, id)){
            return  c.get();
        }
        return null;
    }

    @Override
    public void deleteFligght(int id) {
        Optional<Flight> flight= flightRepository.findById(id);
        if(checkFlight(flight, id)){
            flightRepository.deleteById(id);
        }


    }

    @Override
    public void makeReservation( Plane plane, int places) {
        if (plane.getReservedPlaces()<plane.getSize()-places){


        }
    }

    private boolean checkFlight(Optional<Flight> c, Integer id) {
        return id != null && c.isPresent();
    }
}
