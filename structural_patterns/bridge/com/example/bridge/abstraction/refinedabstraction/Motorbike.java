package com.example.bridge.abstraction.refinedabstraction;

import com.example.bridge.abstraction.Vehicle;
import com.example.bridge.implementor.Factory;

public class Motorbike extends Vehicle {
    public Motorbike(Factory factory1, Factory factory2) {
        super(factory1, factory2);
    }

    @Override
    public void manufacture() {
        System.out.println("Processing motorbike request...");
        factory1.work();
        factory2.work();
        System.out.println("Motorbike produced!");
    }
}
