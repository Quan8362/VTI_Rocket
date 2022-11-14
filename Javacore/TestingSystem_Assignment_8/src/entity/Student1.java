package entity;

import java.io.Serializable;

public class Student1<T> {
    public static int count = 0;
    private T id;
    private String name;

    private int age;

    private float mark;

    public Student1(T id, String name, int age, float mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student1() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
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
}
