package com.java.oop.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public String toString() {
        return id + " " +name + " " +salary;
    }
}

public class EmployeeSort {
      public static void main(String[] args) {
          List<Employee> employees = new ArrayList<>();
          employees.add(new Employee(101,"anil",30000));
          employees.add(new Employee(102,"tarun",20000));
          employees.add(new Employee(103,"vinay",50000));
          employees.add(new Employee(101,"soumya",60000));

          employees.sort(Comparator.comparingDouble(Employee::getSalary));

          employees.forEach(System.out::println);
      }
}