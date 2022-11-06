package entity;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.next().trim());
                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("Wrong inputing! The age must be greater" +
                            " than 0, please input again.");
                }
            } catch (Exception e) {
                System.err.println("wrong inputing! Please input an age as int, " +
                        "input again.");
                System.out.println("please input again:");
            }
        }
    }

    public static int inputAge() {
        while (true) {
            try {
                int input = Integer.parseInt(sc.next().trim());
                if (input >= 0 && input <= 150) {
                    if (input < 18) {
                        System.out.println("Your age must be greater than 18");
                    }
                    return input;
                } else {
                    System.out.println("Wrong inputing!, please input again.");
                    System.out.println("please input again:");
                }
            } catch (Exception e) {
                System.err.println("wrong inputing! Please input an age as int, " +
                        "input again.");
                System.out.println("please input again:");
            }
        }
    }

    public static int inputIntPositive() {
        while (true) {
            try {
                int intPositive = Integer.parseInt(sc.next());
                if (intPositive >= 0) {
                    return intPositive;
                } else {
                    System.err.println("Nhập lại:");
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
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
