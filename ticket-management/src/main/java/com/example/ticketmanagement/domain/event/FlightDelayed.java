package com.example.ticketmanagement.domain.event;

import java.time.Instant;

public class FlightDelayed implements DomainEvent{

    private final FlightId flightId;

    private final Instant occurredOn;


    public FlightDelayed(FlightId flightId, Instant occurredOn) {
        this.flightId = flightId;
        this.occurredOn = occurredOn;
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }

}
