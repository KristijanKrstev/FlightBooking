package com.example.flightcatalog.domain.model;

import com.example.sharedkernel.domain.base.DomainObjectId;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Embeddable;

@Embeddable
public class FlightId extends DomainObjectId {

    @JsonCreator
    private FlightId(String id) {
        super(id);
    }


}
