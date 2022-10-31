package com.vti.backend;

import com.vti.entity.Student;

public class Exercise3_AccessModifier {
    public static void main(String[] args) {
        String name1 = "Nguyen Van A";
        String hometown1 = "Ha Noi";
        Student student = new Student(name1, hometown1);
        student.plusMark(8);
        student.showStudentInfo();
    }
}
