package com.example.subsystem;

import com.example.Department;

public class Sales implements Department {

  @Override
  public void messageDepartment() {
    System.out.println("Welcome to the sales department. How can I help you?");
  }
}
