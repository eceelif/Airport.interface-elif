package com.example.demo.controller;

import com.example.demo.airport.AirportList;
import com.example.demo.airport.IAirport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirportController {
    private final AirportList airportList;

    public AirportController(AirportList airportList) {
        this.airportList = airportList;
    }

    @GetMapping("/airports")
    public List<IAirport> getAllAirports() {
        return airportList.getAirports();
    }
}
