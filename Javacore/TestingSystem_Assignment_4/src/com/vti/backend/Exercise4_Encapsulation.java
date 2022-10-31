package com.vti.backend;

import com.vti.entity.Account_Question2;
import com.vti.entity.Circle;
import com.vti.entity.Date;

public class Exercise4_Encapsulation {
    /* Question 1:
     Tạo Object Student có các property id, name, hometown, điểm học lực
     a) Tất cả các property sẽ để là private để các class khác không
             chỉnh sửa hay nhìn thấy
             b) Tạo constructor cho phép khi khởi tạo mỗi student thì người
     dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
     c) Tạo 1 method cho phép set điểm vào
     d) Tạo 1 method cho phép cộng thêm điểm
     e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
     điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
             4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
                            thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
     Demo các chức năng trên bằng class ở front-end.*/

    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "Black");
        System.out.println("Dien tich hinh tron: " +circle.getArea());

        Account_Question2 account1 = new Account_Question2("VT1","VTI1", 50);
        Account_Question2 account2 = new Account_Question2("VT2","VTI12", 100);
        System.out.println("So tien ban dau cua VTI1: " + account1.getBalance());
        account1.credit(50);
        System.out.println("So tien khi credit 50: " +account1.getBalance());
        account1.debit(30);
        System.out.println("So tien sau khi debit 30: " +account1.getBalance());
        System.out.println("VTI1 chuyen khoan cho VTI2 50: ");
        account1.tranferTo(account2, 50);
        System.out.println("So tien con lai cua VTI1: " +account1.getBalance());
        System.out.println("So tien cua VTI2 sau khi duoc cong: " +account2.getBalance());

        Date date = new Date(8, 10, 2021);
        System.out.println("Ngay vua tao: " + date);
        if (date.isLeapYear()){
            System.out.println("Day la nam nhuan" );
        }else {
            System.out.println("Day khong phai la nam nhuan" );
        }
    }
}

