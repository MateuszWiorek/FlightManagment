package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Flight;
import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/flight/")
public class FlightController {
    FlightService flightService;

    @GetMapping("/getFlights/")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }

    @GetMapping ("/getFlightById/{id}")
    public Flight getFlightById(@PathVariable int id){
        return  flightService.getFlightById(id);
    }

    @PostMapping("/addFlight/{id}")
    public void addFlight(@RequestBody Plane plane, @PathVariable int id){
        flightService.makeReservation(plane, id);
    }

    @PostMapping("/deleteFlight/{id}")
    public void deleteFlight(@PathVariable int id){
        flightService.deleteFligght(id);
    }
}
