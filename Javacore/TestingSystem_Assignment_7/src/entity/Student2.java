package entity;

import java.io.Serializable;

public class Student2 implements Serializable {
    private int id;
    private String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
