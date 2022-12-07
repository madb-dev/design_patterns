package com.example.factory.color;

import com.example.factory.AbstractFactory;
import com.example.factory.color.impl.Black;
import com.example.factory.color.impl.Brown;
import com.example.factory.color.impl.Grey;
import com.example.factory.color.impl.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String typeOfClass) {
        if (typeOfClass == null || typeOfClass.isEmpty()) {
            throw new IllegalArgumentException("Select a type of a color: black, brown, white or grey");
        }

        switch (typeOfClass.toLowerCase()) {
            case "white":
                return new White();
            case "black":
                return new Black();
            case "grey":
                return new Grey();
            case "brown":
                return new Brown();
            default:
                throw new IllegalArgumentException("Color must be: black, grey, white or brown. " + typeOfClass + " is not allowed.");
        }
    }
}
