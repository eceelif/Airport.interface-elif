package com.example.demo.controller;


import com.example.demo.passenger.IPassenger;
import com.example.demo.passenger.PassengerList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {
    private final PassengerList passengerList;

    public PassengerController(PassengerList passengerList) {
        this.passengerList = passengerList;
    }

    @GetMapping("/passengers")
    public List<IPassenger> getAllPassengers() {
        return passengerList.getPassengers();
    }
}
