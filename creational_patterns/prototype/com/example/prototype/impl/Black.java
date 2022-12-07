package com.example.prototype.impl;

import com.example.prototype.Color;

public class Black extends Color {
    public Black(){
        this.colorType = "Black";
    }
    @Override
    public void addColor() {
        System.out.println("Black added");
    }
}
