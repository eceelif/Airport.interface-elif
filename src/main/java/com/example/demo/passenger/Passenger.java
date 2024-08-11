package com.example.demo.passenger;

import org.springframework.stereotype.Component;

@Component
public class Passenger implements IPassenger {
    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassportNumber() {
        return passportNumber;
    }
}
