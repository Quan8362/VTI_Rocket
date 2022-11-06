package entity;

import java.util.Scanner;

public class Department {
    private int id;
    private String name;
    private static int count = 0;
    static Scanner sc;

    public Department() {
        count ++;
        this.id = count;
        System.out.println("Mời bạn nhập tên phòng: ");
        this.name = ScannerUtils.inputString();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
