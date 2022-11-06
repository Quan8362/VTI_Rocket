package backend;

import java.util.Scanner;

public class Exercise2_Question5 {
    public static Scanner sc = new Scanner(System.in);

    public static int inputAge() {
        while (true) {
            try {
                int input = Integer.parseInt(sc.next().trim());
                if (input >= 0) {
                    return input;
                }else {
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
}
