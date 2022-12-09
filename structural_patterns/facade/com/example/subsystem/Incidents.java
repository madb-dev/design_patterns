package com.example.subsystem;

import com.example.Department;

public class Incidents implements Department {

  @Override
  public void messageDepartment() {
    System.out.println("Welcome to the incidents department. How can I help you?");
  }
}
