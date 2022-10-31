package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

import java.time.LocalDate;

public class Exercise1_Constructor {

    /*    Question 1:
      Tạo constructor cho department: a) không có parameters
      b) Có 1 parameter là nameDepartment và default id của Department = 0
      Khởi tạo 1 Object với mỗi constructor ở trên*/
    public static void question1() {
        System.out.println("=====================question 1=====================");
        Department department = new Department();
        Department department1 = new Department("Ban Hang");
    }

    /*Question 2:
            Tạo constructor cho Account:
            a) Không có parameters
            b) Có các parameter là id, Email, Username, FirstName,
            LastName (với FullName = FirstName + LastName)
            c) Có các parameter là id, Email, Username, FirstName,
            LastName (với FullName = FirstName + LastName) và
            Position của User, default createDate = now
            d) Có các parameter là id, Email, Username, FirstName,
            LastName (với FullName = FirstName + LastName) và
            Position của User, createDate
            Khởi tạo 1 Object với mỗi constructor ở trên*/
    public static void question2() {
        System.out.println("=====================question 2=====================");
        Account account = new Account();
        Account account1 = new Account(1, "lvq@gmail.com", "Username1",
                "Luong Van Quan");
        Account account2 = new Account(2, "lvq12@gmail.com", "Username2",
                "Luong Van Quan");
        Position position = new Position();
        Account account3 = new Account(3, "lvqdhv@gmail.com", "Username3",
                "Luong Van Quan", position);
        Account account4 = new Account(3, "lvq12dhv@gmail.com", "Username4",
                "Luong Van Quan", position, LocalDate.of(2022,2, 20));
    }
    /*  Question 3:
    Tạo constructor cho Group:
    a) không có parameters
    b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
    Khởi tạo 1 Object với mỗi constructor ở trên*/
    public static void question3() {
        System.out.println("=====================question 3=====================");

    }

}

