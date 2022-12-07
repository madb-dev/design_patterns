package com.example.factory.animal.impl;

import com.example.factory.animal.Animal;

public class Elephant implements Animal {
    @Override
    public String getAnimal() {
        return "Elephant";
    }

    @Override
    public String getSound() {
        return "Trumpet";
    }
}
