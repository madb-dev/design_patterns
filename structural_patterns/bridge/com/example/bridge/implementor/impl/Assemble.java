package com.example.bridge.implementor.impl;

import com.example.bridge.implementor.Factory;

public class Assemble implements Factory {
    @Override
    public void work() {
        System.out.println("Assembling... wait a moment");
    }
}
