import java.util.Random;

public class Exercise3_BoxingUnboxing {
    /*  Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân)*/
    static void question1() {
        System.out.println("====================question 1====================");
        Integer salary = 5000;
        System.out.println("Luong truoc khi convert la: " + salary);
        System.out.printf("Luong truoc khi convert la:" + " %2.2f", (float) salary);
        System.out.printf("\n");
    }

    //  Question 2: Khai báo 1 String có value = "1234567". Hãy convert String đó ra số int
    static void question2() {
        System.out.println("====================question 2====================");
        String a = "1234567";
        int b = Integer.parseInt(a);
        System.out.println("Sau khi convert String đó ra số int " + b);
    }

    //  Question 3: Khởi tạo 1 số Integer có value là chữ "1234567". Sau đó convert số trên thành datatype int
    static void question3() {
        System.out.println("====================question 3====================");
        Integer a = Integer.valueOf("1234567");
        int b = Integer.parseInt(a.toString());
        System.out.printf("Sau khi convert String đó ra số int " + b);
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }
}
