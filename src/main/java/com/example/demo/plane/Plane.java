package com.example.demo.plane;


import org.springframework.stereotype.Component;

@Component
public class Plane implements IPlane {
    private String model;
    private int capacity;
    private int flightHours;
    private int id; // Uçak ID'si

    public Plane(int id, String model, int capacity, int flightHours) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
        this.flightHours = flightHours;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getFlightHours() {
        return flightHours;
    }


}
