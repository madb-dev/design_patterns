package com.example.state.impl;

import com.example.context.Package;
import com.example.state.PackageState;

public class ReceivedState implements PackageState {

  @Override
  public void next(Package pack) {
    System.out.println("The package is already received.");
  }

  @Override
  public void prev(Package pack) {
    pack.setState(new DeliveredState());
  }

  @Override
  public void printStatus() {
    System.out.println("Package status: received");
  }

  @Override
  public String toString() {
    return "ReceivedState{}";
  }
}
