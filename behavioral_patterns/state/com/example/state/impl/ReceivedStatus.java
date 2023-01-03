package com.example.state.impl;

import com.example.context.Package;
import com.example.state.PackageState;

public class ReceivedStatus implements PackageState {

  @Override
  public void next(Package pack) {
    System.out.println("The package is already received.");
  }

  @Override
  public void prev(Package pack) {
    pack.setState(new DeliveredStatus());
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
