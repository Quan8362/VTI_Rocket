package entity;

import java.util.Scanner;

public class Account {
    private static int count = 0;
    private int id;
    private String userName;
    private int age;
    private Scanner sc = new Scanner(System.in);

    public void inputAge() throws InvalidAgeInputingException {
        System.out.println("Nhập tuôi: ");
        int age = sc.nextInt();
        this.age = age;
        if (this.age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        System.out.println("Age: " + this.age);
    }
}
