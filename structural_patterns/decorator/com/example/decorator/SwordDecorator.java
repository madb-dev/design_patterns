package com.example.decorator;

import com.example.Knight;

public class SwordDecorator extends KnightDecorator {

  public SwordDecorator(Knight decoratedKnight) {
    super(decoratedKnight);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Sword added.");
  }
}
