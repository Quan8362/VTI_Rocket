package backend;

import entity.Student;

import java.util.*;

public class Exercise1_Collection {
    public static void questionn1() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam"));
        students.add(new Student("Dung"));
        students.add(new Student("Nam"));
        students.add(new Student("Nam"));
        //  a) In ra tổng số phần tử của students:
        System.out.println("Tổng số phần tủ của students: " + students.size());
        //  b) Lấy phần tử thứ 4 của students:
        System.out.println("Phần tử thứ 4 của students: " + students.get(3));
        //  c) In ra phần tử đầu và phần tử cuối của students:
        System.out.println("Phần tử đầu của students: " + students.get(0));
        System.out.println("Phần tử cuối của students: " + students.get(students.size() - 1));
        //  d) Thêm 1 phần tử vào vị trí đầu của students:
        students.add(0, new Student("Quan"));
        System.out.println("Thêm 1 phần tử vào vị trí đầu của students: " + students);
        //  e) Thêm 1 phần tử vào vị trí cuối của students:
        students.add(students.size(), new Student("Linh"));
        System.out.println("Thêm 1 phần tử vào vị trí cuối của students: " + students);
        //  f) Đảo ngược vị trí của students:
        Collections.reverse(students);
        System.out.println("Đảo ngược vị trí của students: " + students);
        //  g) Tạo 1 method tìm kiếm student theo id:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id của Student cần tìm: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        for (Student st : students) {
            if (st.getId() == studentId) {
                System.out.println(st);
            }
        }
        //  h) Tạo 1 method tìm kiếm student theo name:
        System.out.println("Nhập Name của Student cần tìm: ");
        String studentName = sc.nextLine();
        for (Student st : students) {
            if (st.getName().equals(studentName)) {
                System.out.println(st);
            }
        }
        //  i) Tạo 1 method để in ra các student có trùng tên:
        System.out.println("Các sinh viên trùng tên: ");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName())) {
                    System.out.println(students.get(i).getName().toString());
                }
            }
        }
        //  j) Xóa name của student có id = 2:
        System.out.println("Nhập Id của Student cần xóa Name: ");
        int inputId = sc.nextInt();
        for (Student st : students) {
            if (st.getId() == inputId) {
                st.setName(null);
                System.out.println(st);
            }
        }
        //  k) Delete student có id = 5:
        System.out.println("Nhập Id của Student cần xóa: ");
        int ipId = sc.nextInt();
        students.removeIf(student -> student.getId() == ipId);
        System.out.println(students);
        //  l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies:
        System.out.println("Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies:: ");
        List<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
        System.out.println(studentCopies);
    }

    public static void question2() {
    /*  Question 3 (Optional): Set
        Tạo 1 student có property id, name
        Khai báo 1 Set students, sau đó làm các chức năng tương tự List*/
        Set<Student> students = new HashSet<>();
        Student student1 = new Student("Dung");
        Student student2 = student1;
        students.add(student1);
        students.add(student2);
        for (Student student : students) {
            System.out.println(student1);
        }
    }
}
