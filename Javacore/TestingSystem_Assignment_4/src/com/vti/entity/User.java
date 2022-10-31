package com.vti.entity;

public abstract class User {
    private String name;
    private double salary;

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public  void displayInfor(){
        System.out.println(this.toString());
    }
}
