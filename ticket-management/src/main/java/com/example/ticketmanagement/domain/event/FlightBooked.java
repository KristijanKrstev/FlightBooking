package com.example.ticketmanagement.domain.event;


import com.example.flightcatalog.domain.model.FlightId;
import com.example.sharedkernel.domain.base.DomainEvent;

import java.time.Instant;

public class FlightBooked implements DomainEvent {
    private final FlightId flightId;

    private final Instant occurredOn;

    public FlightBooked(FlightId flightId, Instant occurredOn) {
        this.flightId = flightId;
        this.occurredOn = occurredOn;
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}
