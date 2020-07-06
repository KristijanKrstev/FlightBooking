package com.example.flightcatalog.domain.repository;

import com.example.flightcatalog.domain.model.Flight;
import com.example.flightcatalog.domain.model.FlightId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, FlightId> {
}
