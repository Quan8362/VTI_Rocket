package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2_Comparing {
    public static void question1(){
        /*Tạo 1 student có property id, name, ngày sinh, điểm và tạo 5 student
        Question 1: Comparable
        In ra học sinh sắp xếp theo name*/
        Student student1 = new Student("Anh");
        Student student2 = new Student("Nam");
        Student student3 = new Student("Linh");
        Student student4 = new Student("Bac");
        Student student5 = new Student("Can");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students);
        // show list students
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void question2(){
       /* Question 2: Comparator
        In ra học sinh sắp xếp theo name, nếu tên trùng nhau thì sẽ sắp xếp
        theo ngày sinh, nếu ngày sinh trùng nhau thì sẽ sắp xếp theo điểm*/
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam", 24, 9.5f));
        students.add(new Student("Nam", 24, 7.5f));
        students.add(new Student("Can", 21, 6));
        students.add(new Student("Minh", 29, 5.5f));
        students.add(new Student("Nam", 20, 8));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareTo(o2.getName()) != 0){
                    return o1.getName().compareTo(o2.getName());
                }else {
                    if (String.valueOf(o1.getAge()).compareTo(String.valueOf(o2.getAge())) != 0){
                        return String.valueOf(o1.getAge()).compareTo(String.valueOf(o2.getAge()));
                    }
                }
                return - String.valueOf(o1.getMark()).compareTo(String.valueOf(o2.getMark()));
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
