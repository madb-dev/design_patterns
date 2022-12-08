package com.example.decorator;

import com.example.Knight;

public class BootDecorator extends KnightDecorator {

  public BootDecorator(Knight decoratedKnight) {
    super(decoratedKnight);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Boots added.");
  }
}
