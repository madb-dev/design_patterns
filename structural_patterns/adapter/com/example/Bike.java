package com.example;

public class Bike implements Journey {
    private Double distance;

    @Override
    public double getDistance() {
        //Distance in miles
        return distance;
    }

    @Override
    public void distance(Double distance) {
        this.distance = distance;
    }
}
