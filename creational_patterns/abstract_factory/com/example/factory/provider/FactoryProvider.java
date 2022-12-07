package com.example.factory.provider;

import com.example.factory.AbstractFactory;
import com.example.factory.animal.AnimalFactory;
import com.example.factory.color.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory){
        if (factory == null || factory.isEmpty()) {
            throw new IllegalArgumentException("Select a factory: animal or color");
        }

        switch (factory.toLowerCase()){
            case "animal":
                return new AnimalFactory();
            case "color":
                return new ColorFactory();
            default:
                throw new IllegalArgumentException("The existing factories are:animal and color");
        }
    }
}
