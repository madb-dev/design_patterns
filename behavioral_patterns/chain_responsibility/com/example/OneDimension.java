package com.example;

import com.example.handler.HandlerDimension;
import java.util.Arrays;

public class OneDimension implements HandlerDimension {

  private HandlerDimension nextHandler;

  @Override
  public void setNext(HandlerDimension nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void process(Dimension dimension) {
    if (dimension.getCoordinates().length == 1) {
      System.out.println(
          "Coordinate of one dimension: " + Arrays.toString(dimension.getCoordinates()));
    } else {
      nextHandler.process(dimension);
    }
  }
}
