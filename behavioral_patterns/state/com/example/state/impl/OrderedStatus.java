package com.example.state.impl;

import com.example.context.Package;
import com.example.state.PackageState;

public class OrderedStatus implements PackageState {

  @Override
  public void next(Package pack) {
    pack.setState(new DeliveredStatus());
  }

  @Override
  public void prev(Package pack) {
    System.out.println("no previous state, the package is ordered.");
  }

  @Override
  public void printStatus() {
    System.out.println("Package status: ordered");
  }

  @Override
  public String toString() {
    return "OrderedState{}";
  }
}
