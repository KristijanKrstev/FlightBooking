package com.example.ticketmanagement.domain.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Seat {

    private Integer rowNumber;
    private Integer seatNumber;

    @Override
    public String toString() {
        return "Seat{" +
                "rowNumber=" + rowNumber +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
