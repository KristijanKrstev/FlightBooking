package com.example.ticketmanagement.application;

import com.example.flightcatalog.domain.model.Flight;
import com.example.flightcatalog.domain.model.FlightId;
import com.example.ticketmanagement.domain.model.Ticket;
import com.example.ticketmanagement.domain.model.TicketId;
import com.example.ticketmanagement.domain.repository.TicketRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class TicketCatalog {

    private final TicketRepository ticketRepository;


    public TicketCatalog(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @NonNull
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @NonNull
    public Optional<Ticket> findById(@NonNull TicketId ticketId) {
        Objects.requireNonNull(ticketId, "ticketId must not be null");
        return ticketRepository.findById(ticketId);
    }



}
