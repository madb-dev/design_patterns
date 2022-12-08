package com.example.bridge.abstraction.refinedabstraction;

import com.example.bridge.abstraction.Vehicle;
import com.example.bridge.implementor.Factory;

public class Car extends Vehicle {
    public Car(Factory factory1, Factory factory2) {
        super(factory1, factory2);
    }

    @Override
    public void manufacture() {
        System.out.println("Processing car request...");
        factory1.work();
        factory2.work();
        System.out.println("Car produced!");
    }
}
