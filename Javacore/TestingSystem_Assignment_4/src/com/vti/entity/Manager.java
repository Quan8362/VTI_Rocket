package com.vti.entity;

public class Manager extends User {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() * 520;
    }
}
