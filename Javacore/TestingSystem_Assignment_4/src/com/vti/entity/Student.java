package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float mark;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.mark = 0;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void plusMark(float diemMuonCong){
        this.mark = this.mark + diemMuonCong;
        System.out.println(this.mark);
    }

    public void showStudentInfo(){
        System.out.println("Ten sinh vien: " + this.name);
        if(this.mark < 4){
            System.out.println("Yeu");
        } else if (this.mark >= 4 && this.mark < 6) {
            System.out.println("Trung binh");
        }
        else if (this.mark >= 6 && this.mark < 8) {
            System.out.println("Kha");
        }else {
            System.out.println("Gioi");
        }
    }
}
