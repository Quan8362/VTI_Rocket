import java.util.Random;
import java.util.Scanner;

public class Exercise1_DatatypeCasting {
    /*  Question 1:
    Khai báo 2 số lương có kiểu dữ liệu là float.
    Khởi tạo Lương của Account 1 là 5240.5 $
    Khởi tạo Lương của Account 2 là 10970.055$
    Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra */
    static void question1() {
        System.out.println("===========question 1============");
        float salary1;
        float salary2;
        salary1 = (float) 5240.5;
        salary2 = (float) 10970.055;
        // lam tron luong:
        int roundSalary1 = (int) salary1;
        int roundSalary2 = (int) salary2;
        System.out.println("Salary1: " + salary1 + " => roundSalary1: " + roundSalary1);
        System.out.println("Salary2: " + salary2 + " => roundSalary2: " + roundSalary2);

    }

    /*  Question 2:
    Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở cuối cho đủ 5 chữ số)*/
    static void question2_1() {
        System.out.println("===========question 2============");
        int min = 0;
        int max = 99999;
        int a = (int) (Math.random() * max) + min;
        if (a == 0) {
            a = a + 1;
        }
        while (a < 10000) {
            a = a * 10;
        }
        System.out.println("So ngau nhien: " + a);
    }

    /*  Question 2:
        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)*/
    static void question2_2() {
        System.out.println("===========question 2============");
        Random random = new Random();
        int a = random.nextInt();
        if (a < 10) {
            System.out.println("So ngau nhien: " + "0000" + a);
        } else if (a < 100) {
            System.out.println("So ngau nhien: " + "000" + a);
        } else if (a < 1000) {
            System.out.println("So ngau nhien: " + "00" + a);
        } else if (a < 10000) {
            System.out.println("So ngau nhien: " + "0" + a);
        } else {
            System.out.println("So ngau nhien: " + a);
        }
    }

    /*  Question 3:
    Lấy 2 số cuối của số ở Question 2 và in ra.
    Gợi ý: Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
           Cách 2: chia lấy dư số đó cho 100*/
    static void question3() {
        System.out.println("===========question 3============");
        int min = 0;
        int max = 99999;
        int a = (int) (Math.random() * max) + min;
        while (a < 10000) {
            a = a * 10;
        }
        System.out.println("So ngau nhien: " + a);
        String b = String.valueOf(a);
        System.out.println("2 so cuoi cua so ngau nhien: " + b.substring(3));
    }

    /*  Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng */
    static void question4() {
        System.out.println("===========question 4============");
        Scanner sc = new Scanner(System.in);
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = scanner.nextInt();
        do {
            System.out.println("Nhập b = ");

            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Vui lòng nhập b khác 0 !");
            }
        } while (b == 0);
        scanner.close();
        System.out.println("Thuong cua hai so: " + (float) a / (float) b);
    }

    public static void main(String[] args) {
        question1();
        question2_1();
        question2_2();
        question3();
        question4();
    }
}
