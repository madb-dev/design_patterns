package com.example.subsystem;

import com.example.Department;

public class Warehouse implements Department {

  @Override
  public void messageDepartment() {
    System.out.println("Welcome to the warehouse department. How can I help you?");
  }
}
