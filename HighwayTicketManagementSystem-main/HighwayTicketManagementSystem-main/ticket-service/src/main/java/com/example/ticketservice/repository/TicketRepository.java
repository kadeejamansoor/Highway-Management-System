package com.example.ticketservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ticketservice.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
