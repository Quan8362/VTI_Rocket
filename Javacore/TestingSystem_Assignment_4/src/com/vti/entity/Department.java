package com.vti.entity;

public class Department {
   private int departmentId;

    private String departmentName;
    public Department() {
    }

    public Department(String departmentName) {
        this.departmentId = 0;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public Department department1() {
        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = "Sale";
        return department;
    }

    public Department department2() {
        Department department = new Department();
        department.departmentId = 2;
        department.departmentName = "Marketing";
        return department;
    }

    public Department department3() {
        Department department = new Department();
        department.departmentId = 3;
        department.departmentName = "BDO";
        return department;
    }

}