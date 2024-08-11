package com.example.demo.airport;

import org.springframework.stereotype.Component;

@Component
public class Airport implements IAirport {
    private String name;
    private String location;
    private int capacity;

    public Airport(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
