package com.example.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Streaming added");
    System.out.println("Message to each subscriber: " + arg);

  }
}
