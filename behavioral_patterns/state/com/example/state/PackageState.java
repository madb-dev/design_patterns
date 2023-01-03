package com.example.state;

import com.example.context.Package;

public interface PackageState {
  void next(Package pack);
  void prev(Package pack);
  void printStatus();

}
