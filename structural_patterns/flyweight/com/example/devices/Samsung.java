package com.example.devices;

import com.example.MobilePhone;

public class Samsung implements MobilePhone {

  private Integer ram;
  private Integer storage;

  public Samsung(Integer ram, Integer storage) {
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
