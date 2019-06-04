package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Ticket;
import com.wiorekmateusz.flightmanagment.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ticket/")
public class TicketController {

    TicketService ticketService;

    @GetMapping("/getTickets/")
    public List<Ticket> getAllTickets(){
        return ticketService.getAll();
    }

    @GetMapping ("/getTicketById/{id}")
    public Ticket getTicket(@PathVariable int id){
        return ticketService.getTicketById(id);
    }

    @PostMapping("/addTicket/")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }

    @PostMapping ("/deleteTicket/{id}")
    public void deleteTicketById(@PathVariable int id){
        ticketService.deleteTicket(id);
    }
}
