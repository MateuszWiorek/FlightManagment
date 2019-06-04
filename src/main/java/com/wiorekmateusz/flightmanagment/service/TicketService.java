package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAll();
    Ticket getTicketById(int id);
    void deleteTicket(int id);
    void addTicket(Ticket ticket);
}
