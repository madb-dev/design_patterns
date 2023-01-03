package com.example.context;

import com.example.state.PackageState;
import com.example.state.impl.OrderedStatus;
import com.sun.org.apache.xpath.internal.operations.Or;

public class Package {

  private PackageState state = new OrderedStatus();

  public PackageState getState() {
    return state;
  }

  public void setState(PackageState state) {
    this.state = state;
  }

  public void previousState() {
    state.prev(this);
  }

  public void nextState() {
    state.next(this);
  }

  public void printStatus() {
    state.printStatus();
  }
}
