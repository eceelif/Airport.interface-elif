package com.example.demo.plane;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlaneList {
    private final List<IPlane> planes = new ArrayList<>();

    public List<IPlane> getPlanes() {
        return planes;
    }

    public IPlane getPlaneById(int id) {
        return planes.stream()
                .filter(plane -> plane.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
