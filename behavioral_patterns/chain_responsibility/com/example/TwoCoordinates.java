package com.example;

import com.example.handler.HandlerDimension;
import java.util.Arrays;

public class TwoCoordinates implements HandlerDimension {

  private HandlerDimension nextHandler;

  @Override
  public void setNext(HandlerDimension nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void process(Dimension dimension) {
    if (dimension.getCoordinates().length == 2) {
      System.out.println(
          "Coordinate of two dimensions: " + Arrays.toString(dimension.getCoordinates()));
    } else {
      nextHandler.process(dimension);
    }
  }
}
