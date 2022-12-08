package com.example.bridge.abstraction;

import com.example.bridge.implementor.Factory;

public abstract class Vehicle {
    protected Factory factory1;
    protected Factory factory2;

    public Vehicle(Factory factory1, Factory factory2) {
        this.factory1 = factory1;
        this.factory2 = factory2;
    }

    public abstract void manufacture();
}
