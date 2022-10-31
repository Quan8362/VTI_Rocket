package com.vti.entity;

public class Employee extends  User{

    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary()*420;
    }
}
