package com.example.sharedkernel.domain.geo;


import com.example.sharedkernel.domain.base.ValueObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Embeddable
@MappedSuperclass
public class Location implements ValueObject {

    @Column(name = "city")
    @Embedded
    private CityName city;
    @Column(name = "country")
    @Enumerated(EnumType.STRING)
    private Country country;

    @SuppressWarnings("unused") // Used by JPA only.
    protected Location() {
    }

    public Location(@NonNull CityName city,
                   @NonNull Country country) {

        this.city = city;
        this.country = country;
    }

    @NonNull
    @JsonProperty("city")
    public CityName city() {
        return city;
    }

    @NonNull
    @JsonProperty("country")
    public Country country() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location address = (Location) o;
        return Objects.equals(city, address.city) &&
                country == address.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", country=" + country +
                '}';
    }
}

    

