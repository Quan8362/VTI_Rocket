package com.vti.entity;

public class Waiter extends User {
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() * 220;
    }
}
