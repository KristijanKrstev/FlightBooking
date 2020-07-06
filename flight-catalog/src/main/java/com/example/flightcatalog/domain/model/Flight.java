package com.example.flightcatalog.domain.model;

import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.geo.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
public class Flight extends AbstractEntity<FlightId> {

    @Version
    private Long version;

    private int price;

    private int quantity;

    private LocalDateTime time;

    private Location relation;


    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setRelation(Location relation) {
        this.relation = relation;
    }

    public Flight() {
    }

    public Flight(FlightId id, int price, int quantity, LocalDateTime time, Location relation) {
        super(id);
        this.price=price;
        this.quantity=quantity;
        this.time=time;
        this.relation=relation;
    }
}
