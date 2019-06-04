package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.*;
import com.wiorekmateusz.flightmanagment.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class RestController {
    public final PassengerService passengerService;
    public final PlaneService planeService;
    public  final FlightService flightService;
    public final AirportService airportService;
    public final TicketService ticketService;
    public final OrderService orderService;

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

    @GetMapping("/listPlanes")
    public List<Plane> getPlanes(){
        return planeService.getAll();
    }

    @GetMapping("/getPlane/{id}")
    public Plane getPlane(@PathVariable int id){
        return planeService.getById(id);
    }

    @PostMapping("/addPlane/")
    public void addPlane(@RequestBody Plane plane){
        planeService.addNew(plane);
    }

    @PostMapping("/deletePlane/{id}")
    public void deletePlane(@PathVariable int id){
        planeService.deletePlane(id);
    }

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

    @GetMapping ("/getTickets/")
    public List<Ticket> getAllTickets(){
        return ticketService.getAll();
    }

    @GetMapping ("/getTicketById/{id}")
    public Ticket getTicket(@PathVariable int id){
        return ticketService.getTicketById(id);
    }

    @PostMapping ("/addTicket/")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }

    @PostMapping ("/deleteTicket/{id}")
    public void deleteTicketById(@PathVariable int id){
        ticketService.deleteTicket(id);
    }

    @GetMapping ("/getFlights/")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }

    @GetMapping ("/getFlightById/{id}")
    public Flight getFlightById(@PathVariable int id){
        return  flightService.getFlightById(id);
    }

    @PostMapping ("/addFlight/{id}")
    public void addFlight(@RequestBody Plane plane, @PathVariable int id){
        flightService.makeReservation(plane, id);
    }

    @PostMapping("/deleteFlight/{id}")
    public void deleteFlight(@PathVariable int id){
        flightService.deleteFligght(id);
    }

    @GetMapping ("/getOrders/")
    public List<OrderTicket> getAll(){
        return orderService.getAll();
    }

    @GetMapping ("/getOrderById/{id}/")
    public OrderTicket getOrderdById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping ("/addOrder/")
    public void addOrder(@RequestBody OrderTicket order){
        orderService.addOrder(order);
    }

    @PostMapping ("deleteOrder/{id}/")
    public void deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
    }





}
