package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Passenger;
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
    @GetMapping("/home")
    public String gethome(){
        return "home";
    }

    @GetMapping("/listPassengers")
    public List<Passenger> getPassengers(){
        return passengerService.getPassengersList();
    }

    @GetMapping("getPassenger/{id}}")
    public String getPassenger(@PathVariable int id){
        return passengerService.getById(id).toString();
    }

}
