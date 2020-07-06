package com.example.flightcatalog.application;


import com.example.flightcatalog.domain.model.Flight;
import com.example.flightcatalog.domain.model.FlightId;
import com.example.flightcatalog.domain.repository.FlightRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class FlightCatalog {

    private final FlightRepository flightRepository;


    public FlightCatalog(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @NonNull
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @NonNull
    public Optional<Flight> findById(@NonNull FlightId flightId) {
        Objects.requireNonNull(flightId, "flightId must not be null");
        return flightRepository.findById(flightId);
    }



}

