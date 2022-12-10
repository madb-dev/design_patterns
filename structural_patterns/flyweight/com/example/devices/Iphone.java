package com.example.devices;

import com.example.MobilePhone;

public class Iphone implements MobilePhone {

  private Integer ram;
  private Integer storage;

  public Iphone(Integer ram, Integer storage) {
    this.ram = ram;
    this.storage = storage;
  }

  @Override
  public int getRam() {
    return ram;
  }

  @Override
  public int getStorage() {
    return storage;
  }
}
