package com.example.ticketmanagement.domain.model;

import java.math.BigDecimal;

public enum TicketType {
    ADULT(BigDecimal.valueOf(25)),
    STUDENT(BigDecimal.valueOf(18)),
    CHILD(BigDecimal.valueOf(12));

    private BigDecimal value;

    TicketType(BigDecimal valueOf) {
        value = valueOf;
    }

    public BigDecimal getValue() {
        return value;
    }
}
