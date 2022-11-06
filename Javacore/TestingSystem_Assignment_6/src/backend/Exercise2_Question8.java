package backend;

import java.util.Scanner;

public class Exercise2_Question8 {
    private static Scanner sc = new Scanner(System.in);

    public static Float inputFloat() {
        while (true) {
            try {
                return Float.parseFloat(sc.next());
            } catch (Exception e) {
                System.out.println("Mời bạn nhập lại: ");
            }
        }
    }

    public static Double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.next());
            } catch (Exception e) {
                System.out.println("Mời bạn nhập lại: ");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.out.println("Mời bạn nhập lại: ");
            }
        }
    }
}
