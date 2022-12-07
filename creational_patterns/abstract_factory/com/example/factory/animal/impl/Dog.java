package com.example.factory.animal.impl;

import com.example.factory.animal.Animal;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String getSound() {
        return "Bark";
    }
}
