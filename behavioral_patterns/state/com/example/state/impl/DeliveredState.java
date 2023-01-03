package com.example.state.impl;

import com.example.context.Package;
import com.example.state.PackageState;

public class DeliveredState implements PackageState {

  @Override
  public void next(Package pack) {
    pack.setState(new ReceivedState());
  }

  @Override
  public void prev(Package pack) {
    pack.setState(new OrderedState());
  }

  @Override
  public void printStatus() {
    System.out.println("Package status: delivered");
  }

  @Override
  public String toString() {
    return "DeliveredState{}";
  }
}
