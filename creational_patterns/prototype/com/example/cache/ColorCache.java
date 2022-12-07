package com.example.prototype.cache;

import com.example.prototype.Color;
import com.example.prototype.impl.Black;
import com.example.prototype.impl.Green;
import com.example.prototype.impl.White;

import java.util.HashMap;
import java.util.Map;

public class ColorCache {
    private static final Map<String, Color>  colorMap = new HashMap<>();

    public static Color getColor(String color){
        Color colorToBeCloned = colorMap.get(color);
        return (Color) colorToBeCloned.clone();
    }

    public static void loadCache(){
        Black black = new Black();
        colorMap.put(black.getColorType(), black);

        Green green = new Green();
        colorMap.put(green.getColorType(), green);

        White white = new White();
        colorMap.put(white.getColorType(), white);
    }
}
