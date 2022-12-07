package com.example.prototype.impl;

import com.example.prototype.Color;

public class White extends Color {

    public White(){
        this.colorType = "White";
    }
    @Override
    public void addColor() {
        System.out.println("White added");
    }
}
