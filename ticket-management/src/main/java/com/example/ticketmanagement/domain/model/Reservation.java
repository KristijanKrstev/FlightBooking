package com.example.ticketmanagement.domain.model;

import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.ticketmanagement.domain.model.exception.ReservationAlreadyCancelledException;
import com.example.ticketmanagement.domain.model.exception.ReservationAlreadyConfirmedException;
import com.example.ticketmanagement.domain.model.exception.ReservationAlreadyExpiredException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Entity
@AllArgsConstructor
public class Reservation extends AbstractEntity<ReservationId> {

    private ReservationStatus status;

    private LocalDateTime expiresAt;

    private LocalDateTime createdAt;

    private String name;

    private String surname;

    @OneToMany
    private Set<Ticket> tickets;

    private BigDecimal totalPrice;


    public void calculateTotalPrice() {
        if (this.tickets == null) {
            this.totalPrice = BigDecimal.ZERO;
        } else {
            this.totalPrice = this.tickets.stream()
                    .map(Ticket::getPriceValue)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
    }

    public void cancelFlight() {
        this.status = ReservationStatus.CANCELED;
    }

    public void confirmFlight() {
        if (this.status == ReservationStatus.CANCELED) {
            throw new ReservationAlreadyCancelledException();
        }
        if (this.status == ReservationStatus.CONFIRMED) {
            throw new ReservationAlreadyConfirmedException();
        }
        if (this.expiresAt != null && LocalDateTime.now().isAfter(this.expiresAt)) {
            throw new ReservationAlreadyExpiredException();
        }
        this.status = ReservationStatus.CONFIRMED;
    }



}
