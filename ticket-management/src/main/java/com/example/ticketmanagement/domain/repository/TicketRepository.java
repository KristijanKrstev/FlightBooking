package com.example.ticketmanagement.domain.repository;

import com.example.ticketmanagement.domain.model.Ticket;
import com.example.ticketmanagement.domain.model.TicketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, TicketId> {

}
