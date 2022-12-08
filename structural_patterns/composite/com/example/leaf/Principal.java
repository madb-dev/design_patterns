package com.example.leaf;

import com.example.Employee;

public class Principal implements Employee {
    private Integer id;
    private String name;
    private String lastName;
    private String position;

    public Principal(Integer id, String name, String lastName, String position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+ name +" "+ lastName + " with "+ position +" position.");
    }
}
