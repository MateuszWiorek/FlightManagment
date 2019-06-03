package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Passenger;
import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.service.FlightService;
import com.wiorekmateusz.flightmanagment.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import com.wiorekmateusz.flightmanagment.service.PassengerService;

import java.util.List;

@Configuration
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class RestController {
    public final PassengerService passengerService;
    public final PlaneService planeService;
    public  final FlightService flightService;

    @GetMapping("/listPassengers")
    public List<Passenger> getPassengers(){
        return passengerService.getPassengersList();
    }

    @GetMapping("/getPassenger/{id}")
    public Passenger getPassenger(@PathVariable int id){
        return passengerService.getById(id);
    }

    @GetMapping("/listPlanes")
    public List<Plane> getPlanes(){
        return planeService.getAll();
    }

    @GetMapping("/getPlane/{id}")
    public Plane getPlane(@PathVariable int id){
        return planeService.getById(id);
    }



}
