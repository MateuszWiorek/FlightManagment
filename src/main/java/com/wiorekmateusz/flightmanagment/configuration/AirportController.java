package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Airport;
import com.wiorekmateusz.flightmanagment.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airport/")
@RequiredArgsConstructor

public class AirportController {
    AirportService airportService;

    @GetMapping("/getAirports/")
    public List<Airport> getAllAirports(){
        return airportService.getAll();
    }

    @GetMapping("/getAirport/{id}")
    public Airport getAirport(@PathVariable int id){
        return airportService.getAirportById(id);
    }

    @PostMapping("/addAirport/")
    public void addAirport(@RequestBody Airport airport){
        airportService.addAirport(airport);
    }

    @PostMapping ("/deleteAirport/{id}/")
    public void deleteAirport(@PathVariable int id){
        airportService.deleteAirport(id);
    }

    @PostMapping ("/deleteAllAirports/")
    public void deleteAll(){
        airportService.deleteAll();
    }
}
