package entity;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable, Comparable<Student> {
    public static int count = 0;
    private int id;
    private String name;

    private int age;

    private float mark;

    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return -this.name.compareTo(student.getName());
    }


}
