package com.example.factory;

public interface AbstractFactory<T> {
    T create(String typeOfClass);
}
