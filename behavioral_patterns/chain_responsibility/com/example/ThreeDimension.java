package com.example;

import com.example.handler.HandlerDimension;
import java.util.Arrays;

public class ThreeDimension implements HandlerDimension {

  private HandlerDimension nextHandler;

  @Override
  public void setNext(HandlerDimension nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void process(Dimension dimension) {
    if (dimension.getCoordinates().length == 3) {
      System.out.println(
          "Coordinate of three dimensions: " + Arrays.toString(dimension.getCoordinates()));
    } else {
      System.out.println("There aren't any dimensions");
    }
  }
}
