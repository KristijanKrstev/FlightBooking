package com.example.ticketmanagement.domain.model;

import com.example.sharedkernel.domain.base.AbstractEntity;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

@Getter
@Entity
public class Ticket extends AbstractEntity<TicketId> {

    private Seat seat;

    private  TicketType ticketType;


    public BigDecimal getPriceValue() {
        return this.ticketType.getValue();
    }
}
