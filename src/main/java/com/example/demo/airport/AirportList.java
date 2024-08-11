package com.example.demo.airport;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AirportList {
    private List<IAirport> airports = new ArrayList<>();

    public void addAirport(IAirport airport) {
        airports.add(airport);
    }

    public List<IAirport> getAirports() {
        return airports;
    }
}
