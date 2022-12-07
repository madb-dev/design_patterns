package com.example.factory.animal.impl;

import com.example.factory.animal.Animal;

public class Lion implements Animal {
    @Override
    public String getAnimal() {
        return "Lion";
    }

    @Override
    public String getSound() {
        return "Roar";
    }
}
