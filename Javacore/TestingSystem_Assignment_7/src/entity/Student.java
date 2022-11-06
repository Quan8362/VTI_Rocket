package entity;

import utils.ScannerUtils;

public class Student {
    public static int count = 0;
    private int id;
    private String name;
    public static String college = "Đại học bách khoa";

    private int moneyGroup;
    
    public static int sumMoneyGroup = 0;

    public Student() {
        count++;
        this.id = count;
        System.out.println("Nhập vào tên sinh viên: ");
        this.name = ScannerUtils.inputString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public int getMoneyGroup() {
        return moneyGroup;
    }

    public void setMoneyGroup(int moneyGroup) {
        this.moneyGroup = moneyGroup;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name = " + name + ", college = " + college + "}";
    }
}
