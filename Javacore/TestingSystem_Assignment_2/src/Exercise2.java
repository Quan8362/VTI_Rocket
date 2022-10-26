import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {

    static void question1() {
    /*  Question 1:
        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
        nguyên đó*/
        int i = 5;
        System.out.println(i);
    }

    static void question2() {
    /*  Question 2:
        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên
        đó thành định dạng như sau: 100,000,000*/
        int i = 100000000;
        System.out.printf("%,8d%n", i);
    }

    static void question3() {
/*      Question 3:
        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        thực đó chỉ bao gồm 4 số đằng sau*/
        double i = 5.567098;
        System.out.printf("%5.4f", i);
    }

    static void question4() {
    /*  Question 4:
        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        dạng như sau:
        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/
        System.out.println("Tên tôi là \"Nguyễn Văn A\" và tôi đang độc thân");
    }

    static void question5() {
    /*  Question 5:
        Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s */
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy hh'h':mm'p':ss's'");
        System.out.println("Thời gian bây giờ: " + ft.format(dNow));
    }

    static void question6() {
/*      Question 6:
        In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database)*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        String fullLength = String.format("| %-20s | %-20s | %-20s | %-20s |%n", "AccountId", "Email", "Name", "Department");
        int countLength = fullLength.length() - String.format("%n").length();
        for (int i = 0; i < countLength; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("| %-20s | %-20s | %-20s | %-20s |%n", "AccountId", "Email", "Name", "Department");
        for (int i = 0; i < countLength; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (Account acc : accounts) {
            System.out.printf("| %-20s | %-20s | %-20s | %-20s |%n", acc.id, acc.email, acc.userName, acc.department.departmentName);
            for (int i = 0; i < countLength; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
        question6();
    }
}
