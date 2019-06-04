package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Ticket;
import com.wiorekmateusz.flightmanagment.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service ("ticketService")
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAll() {
        System.out.println(ticketRepository.findAll().toString());
        return ticketRepository.findAll();

    }

    @Override
    public Ticket getTicketById(int id) {
        Ticket ticket;
        Optional<Ticket> c = ticketRepository.findById(id);
        if(checkTicket(c, id)){
            ticket=c.get();
            return ticket;
        }
        return null;
    }

    @Override
    public void deleteTicket(int id) {
        Optional<Ticket> c = ticketRepository.findById(id);
        if (checkTicket(c, id)){
            ticketRepository.deleteById(id);
        }

    }

    @Override
    public void addTicket(Ticket ticket) {
        Ticket t = generateTicketFromBody(ticket);
        ticketRepository.saveAndFlush(t);

    }

    private Ticket generateTicketFromBody(Ticket ticket){
        Ticket t = new Ticket();
        t.setId(ticket.getId());
        t.setName(ticket.getName());
        t.setNumberOfPlaces(ticket.getNumberOfPlaces());
        t.setTotalPrice(ticket.getTotalPrice());
        t.setFlightId(ticket.getFlightId());
        return t;
    }
    private boolean checkTicket(Optional<Ticket> c, Integer id) {
        return id != null && c.isPresent();
    }
}
