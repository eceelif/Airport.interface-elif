package com.example.demo.passenger;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PassengerList {
    private List<IPassenger> passengers = new ArrayList<>();

    public void addPassenger(IPassenger passenger) {
        passengers.add(passenger);
    }

    public List<IPassenger> getPassengers() {
        return passengers;
    }
}
