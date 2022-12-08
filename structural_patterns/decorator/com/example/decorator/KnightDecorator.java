package com.example.decorator;

import com.example.Knight;

public abstract class KnightDecorator implements Knight {

  private Knight decoratedKnight;

  public KnightDecorator(Knight decoratedKnight) {
    this.decoratedKnight = decoratedKnight;
  }

  @Override
  public void assemble() {
    decoratedKnight.assemble();
  }
}
