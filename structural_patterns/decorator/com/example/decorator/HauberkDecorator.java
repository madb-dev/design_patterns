package com.example.decorator;

import com.example.Knight;

public class HauberkDecorator extends KnightDecorator {

  public HauberkDecorator(Knight decoratedKnight) {
    super(decoratedKnight);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Hauberk added.");
  }
}
