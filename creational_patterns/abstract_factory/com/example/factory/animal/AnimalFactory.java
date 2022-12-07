package com.example.factory.animal;

import com.example.factory.AbstractFactory;
import com.example.factory.animal.impl.Dog;
import com.example.factory.animal.impl.Elephant;
import com.example.factory.animal.impl.Lion;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String typeOfClass) {
        if (typeOfClass == null || typeOfClass.isEmpty()) {
            throw new IllegalArgumentException("Select a type of an animal: lion, elephant or dog");
        }

        switch (typeOfClass.toLowerCase()) {
            case "lion":
                return new Lion();
            case "dog":
                return new Dog();
            case "elephant":
                return new Elephant();
            default:
                throw new IllegalArgumentException("Animal must be: lion, elephant or dog. " + typeOfClass + " is not allowed.");
        }
    }
}
