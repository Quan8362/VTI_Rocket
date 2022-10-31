package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private int id;

    private String name;

    private LocalDate createDate;
    private Account creator;
    private Account[] accounts; // Lưu trữ nhưng account thuộc 1 group

    public Group() {

    }

    public Group(String name, Account creator, Account[] accounts, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String name, Account creator, String[] usernames, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account(usernames[i]);
        }
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public Group[] groups() {
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developer";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Test";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";

        Group[] groups = {group1, group2, group3};
        return groups;
    }
}
