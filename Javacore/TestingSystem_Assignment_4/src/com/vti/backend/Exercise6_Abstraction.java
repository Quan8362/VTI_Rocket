package com.vti.backend;

import com.vti.entity.*;

import java.util.Scanner;

public class Exercise6_Abstraction {
    /*  Question 1: abstract class & abstract method
        Tạo 1 class Phone để lưu thông tin liên lạc, trong Phone có chứa 1
        property có kiểu dữ liệu là Array contacts, trong từng contact có lưu
        thông tin number, name
        a) Tạo các abstract method
                a. void insertContact(String name, String phone)
                b. void removeContact(String name)
                c. void updateContact(String name, String newPhone)
                d. void searchContact(String name)
        b) Tạo class VietnamesePhone kế thừa Phone và triển khai các
        method abstract
        Viết chương trình demo*/
    static Phone phone = new VietnamesePhone();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        question1();
        question2();
    }


    public static void question1() {
        while (true) {
            System.out.println("==============Demo===============");
            System.out.println("====1. thêm thông tin  ==========");
            System.out.println("====2. xóa thông tin=============");
            System.out.println("====3. sửa thông tin ============");
            System.out.println("====4. tìm kiếm thông tin =======");
            System.out.println("=================================");
            int choose;
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    insertContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContact();
                    break;
                default:
                    return;
            }
        }
    }
    /*  Question 2 (Optional):
        Hãy xây dựng 1 class User với các thuộc tính name kiểu String và salary ratio kiểu double.
        a) Viết các hàm cho phép nhập và trả về name, salary ratio.
        b) Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân viên, kiểu double.
    c) Viết hàm displayInfor()*/

/*    Question 3 (Optional): Tiếp tục Question 2
    Viết class Employee, Manager, Waiter kế thừa User như sau:
    Implement method calculatePay() như sau:
    Đối với Employee sẽ được tính = salary ratio * 420
    Đối với Manager sẽ được tính = salary ratio * 520
    Đối với Waiter sẽ được tính = salary ratio * 220*/

    private static void searchContact() {

        System.out.println("Nhập tên cần tìm kiếm:");
        String name;
        name = sc.nextLine();
        phone.searchContact(name);
    }

    private static void updateContact() {
        String name;
        System.out.println("Nhap ten can sua so phone:");
        name = sc.nextLine();
        String newPhone;
        System.out.println("Nhap so phone moi:");
        newPhone = sc.nextLine();
        phone.updateContact(name, newPhone);
        System.out.println("Thong tin sau khi sua:");
        phone.searchContact(name);
    }

    private static void removeContact() {
        String name;
        System.out.println("Nhap ten can xoa:");
        name = sc.nextLine();
        phone.removeContact(name);
    }

    private static void insertContact() {
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap phone:");
        String phonee = sc.nextLine();
        phone.insertContact(name, phonee);
    }

    public static void question2(){
        User user = new Manager("dong0",120.2);
        user.displayInfor();
        System.out.println(user.calculatePay());
        User user2 = new Employee("dong0",120.2);
        user2.displayInfor();
        System.out.println(user2.calculatePay());
    }
}