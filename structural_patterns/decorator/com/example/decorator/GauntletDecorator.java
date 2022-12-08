package com.example.decorator;

import com.example.Knight;

public class GauntletDecorator extends KnightDecorator {

  public GauntletDecorator(Knight decoratedKnight) {
    super(decoratedKnight);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Gauntlets added");
  }
}
