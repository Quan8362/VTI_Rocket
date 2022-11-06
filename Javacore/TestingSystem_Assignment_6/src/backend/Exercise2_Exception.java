package backend;

import java.util.ArrayList;

public class Exercise2_Exception {
    public static void main(String[] args) {
        try {
            float result = divide(7, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("cannot divide 0");
            System.exit(1);
        } finally {
            System.out.println("divide completed!");
        }
    }

    public static float divide(int a, int b) {
        return a / b;
    }
}
