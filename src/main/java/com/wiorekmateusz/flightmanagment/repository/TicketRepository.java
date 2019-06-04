package com.wiorekmateusz.flightmanagment.repository;

import com.wiorekmateusz.flightmanagment.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
