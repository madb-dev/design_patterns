package com.example.decorator;

import com.example.Knight;

public class HelmetDecorator extends KnightDecorator {

  public HelmetDecorator(Knight decoratedKnight) {
    super(decoratedKnight);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Helmet added.");
  }
}
