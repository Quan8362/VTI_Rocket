package backend;

import entity.MyMap;
import entity.Student1;

import java.util.ArrayList;

public class Exercise3_Generic {
    public static void question1(){
       /* Question 1: T generic (class)
        Tạo class student có property id, name (trong đó id của student có thể là int, long, float)
        a) Tạo đối tượng student có id là int
        b) Tạo đối tượng student có id là float
        c) Tạo đối tượng student có id là double*/
        ArrayList<Student1> student1s = new ArrayList<>();
        student1s.add(new Student1<>(1d, "Nam", 22, 9.5f));
        student1s.add(new Student1<>(5.6f, "Nam", 22, 9.5f));
        student1s.add(new Student1<>(100L, "Nam", 22, 9.5f));
        System.out.println(student1s);
    }
    public static void question6(){
       /* Question 6: K & V generic
        Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
        Tạo các method:
            a) GetValue()
            b) getKey ()
        Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên và value là tên của sinh viên đó*/
        MyMap<String, Student1> studentInfo = new MyMap<>();
        Student1 student1 = new Student1<>(1,"Nam",25,9.5f);
        studentInfo.setKey("sv1");
        studentInfo.setValue(student1);
        System.out.println(studentInfo);

    }
}
