package com.example.ticketmanagement.application;

import com.example.flightcatalog.domain.model.Flight;
import com.example.flightcatalog.domain.model.FlightId;

import java.util.List;

public interface FlightCatalog {

    List<Flight> findAll();

    Flight findById(FlightId id);

}
