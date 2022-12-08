package com.example.composite;

import com.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class SuperIntendent implements Employee {
    private Integer id;
    private String name;
    private String lastName;
    private String position;

    private List<Employee> subordinateEmployees;


    public SuperIntendent(Integer id, String name, String lastName, String position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.subordinateEmployees = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + " " + lastName + " with " + position + " position.");
        subordinateEmployees.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        subordinateEmployees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        subordinateEmployees.remove(employee);
    }
}
