package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Passenger;
import com.wiorekmateusz.flightmanagment.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/passenger/")
public class PassengerController {
    public final PassengerService passengerService;

    @GetMapping("/listPassengers")
    public List<Passenger> getPassengers(){
        return passengerService.getPassengersList();
    }

    @GetMapping("/getPassenger/{id}")
    public Passenger getPassenger(@PathVariable int id){
        return passengerService.getById(id);
    }

    @PostMapping("/addPassenger/")
    public void addPassenger(@RequestBody Passenger passenger){
        passengerService.addPassenger(passenger);
    }

    @PostMapping("/deletePassenger/{id}")
    public void deletePassenger(@PathVariable("id") int id){
        passengerService.deletePassenger(id);
    }
}
