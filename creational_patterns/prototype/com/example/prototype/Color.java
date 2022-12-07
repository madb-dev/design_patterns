package com.example.prototype;

public abstract class Color implements Cloneable {
    protected String colorType;
    public abstract void addColor();
    public String getColorType(){
        return colorType;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
