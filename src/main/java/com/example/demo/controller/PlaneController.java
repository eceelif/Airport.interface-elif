package com.example.demo.controller;

import com.example.demo.plane.IPlane;
import com.example.demo.plane.PlaneList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/elif")
public class PlaneController {

    private final PlaneList planeList;

    @Autowired
    public PlaneController(PlaneList planeList) {
        this.planeList = planeList;
    }

    @GetMapping
    public String getMessage() {
        return "deneme uçak";
    }

    @GetMapping("/planes")
    public List<IPlane> getAllPlanes() {
        return planeList.getPlanes();
    }

    @GetMapping("/planes/{id}")
    public IPlane getPlaneById(@PathVariable int id) {
        return planeList.getPlaneById(id);
    }
}
