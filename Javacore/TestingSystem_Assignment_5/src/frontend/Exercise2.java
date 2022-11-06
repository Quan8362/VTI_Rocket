package frontend;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
//        Tương tự với các method còn lại
//        Hãy viết chương trình thực hiện các lệnh sau:
//        a) Tạo 10 học sinh, chia thành 3 nhóm
//        b) Kêu gọi cả lớp điểm danh.
//        c) Gọi nhóm 1 đi học bài
//        d) Gọi nhóm 2 đi dọn vệ sinh
        Student student1 = new Student(1, "Nguyen Ha", 2);
        Student student2 = new Student(2, "Nguyen Hai", 5);
        Student student3 = new Student(3, "Tran Thi Mai", 3);
        Student student4 = new Student(4, "Luong Van Quan", 2);
        Student student5 = new Student(5, "La Thi Thu", 4);
        Student student6 = new Student(6, "Tran Van Canh", 1);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        caLopDiemDanh(students);
        nhom1HocBai(students);
        nhom2DiDonVeSinh(students);
    }

    private static void caLopDiemDanh(List<Student> students) {
        for (Student st : students) {
            st.checkin();
        }
    }

    private static void nhom1HocBai(List<Student> students) {
        for (Student st : students) {
            if (st.getGroup() == 1) {
                st.study();
            }
        }
    }

    private static void nhom2DiDonVeSinh(List<Student> students) {
        for (Student st : students) {
            if (st.getGroup() == 2) {
                st.clean();
            }
        }
    }
}
