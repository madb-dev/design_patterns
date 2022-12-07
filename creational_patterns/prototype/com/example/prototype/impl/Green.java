package com.example.prototype.impl;

import com.example.prototype.Color;

public class Green extends Color {
    public Green(){
        this.colorType = "Green";
    }
    @Override
    public void addColor() {
        System.out.println("Green added");
    }
}
