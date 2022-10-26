import java.util.Random;

public class Exercise4 {
    static void question1() {
//      Question 1: In ngẫu nhiên ra 1 số nguyên
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("So nguyen ngau nhien la: " + n);
    }

    static void question2() {
//      Question 2: In ngẫu nhiên ra 1 số thực
        Random random = new Random();
        float f = random.nextFloat();
        System.out.println("So thuc ngau nhien la: " + f);
    }
    static void question3() {
//      Question 3:
//      Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
        Random random = new Random();
        String[] arrays = {"Hung", "Hai", "Ha", "Yen"};
        int i = random.nextInt(arrays.length);
        System.out.println("Ten ngau nhien cua 1 ban trong lop la: " + arrays[i]);
    }

    public static void main(String[] args) {
//        question1();
//        question2();
        question3();
    }
}
