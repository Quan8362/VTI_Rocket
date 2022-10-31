package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    private int id; // 0

    private String email; // null

    private String userName;

    private String fullName;

    private Department department;

    private Position position;

    private LocalDate createDate;

    private float salary;
    private Group[] groups;

    public Account() {

    }

    public Account(int id, String email, String userName, String fullName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
    }

    public Account(int id, String email, String userName, String fullName, Position position) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(String userName) {
        this.userName = userName;
    }

    public Account(int id, String email, String userName, String fullName, Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.position = position;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    public Account account1() {
        Account account = new Account();
        account.id = 5;
        account.email = "vti1@gmail.com";
        account.userName = "username1";
        account.fullName = "Trần Bình Minh";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[0], group.groups()[2]};
        Department department = new Department();
        account.department = department.department1();
        Position position = new Position();
        account.position = position.position1();
        account.createDate = LocalDate.now();
        return account;
    }

    public Account account2() {
        Account account = new Account();
        account.id = 2;
        account.email = "vti2@gmail.com";
        account.userName = "username2";
        account.fullName = "Lương Thu Trang";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[1], group.groups()[0]};
        Department department = new Department();
        account.department = department.department3();
        account.createDate = LocalDate.now();
        return account;
    }

    public Account account3() {
        Account account = new Account();
        account.id = 4;
        account.email = "vti3@gmail.com";
        account.userName = "username3";
        account.fullName = "Lee Thanh Tung";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[1], group.groups()[2]};
        Department department = new Department();
        account.department = department.department2();
        account.createDate = LocalDate.now();
        return account;
    }
}
