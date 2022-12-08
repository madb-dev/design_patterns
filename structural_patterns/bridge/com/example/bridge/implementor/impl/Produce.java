package com.example.bridge.implementor.impl;

import com.example.bridge.implementor.Factory;

public class Produce implements Factory {
    @Override
    public void work() {
        System.out.println("Producing the pieces... wait a moment");
    }
}
