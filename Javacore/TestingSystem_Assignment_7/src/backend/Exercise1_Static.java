package backend;

import entity.Student;

import java.util.Scanner;

public class Exercise1_Static {
    /*  Question 1: static variable
        Khai báo 1 class student có các thuộc tính id, name, college Với college là static variable.
        Hãy khởi tạo các student sau:
        Student có id = 1, name ="Nguyễn Văn A"
        Student có id = 2, name = " Nguyễn Văn B "
        Student có id = 3, name = " Nguyễn Văn C "
        Và tất cả các student này đều học ở "Đại học bách khoa". Dùng vòng for để in ra thông tin các student
        Sau đó hãy chuyển các student này sang "Đại học công nghệ" Dùng vòng for để in ra thông tin các student*/
    public static void question1() {
        Student[] stusents = new Student[3];
        System.out.println("Khởi tạo 3 sinh viên: ");
        for (int i = 0; i < stusents.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            Student st = new Student();
            stusents[i] = st;
        }
        System.out.println("Thông tin các sinh viên vừa nhập: ");
        for (Student st : stusents) {
            System.out.println(st);
        }
        System.out.println("Chuyển các học sinh sang Đại học công nghệ");
        Student.college = "Đại học công nghệ";
        System.out.println("Thông tin học sinh sau khi chuyển:");
        for (Student st : stusents) {
            System.out.println(st);
        }
    }

    /*  Question 2: tiếp tục question 1
    Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ lớp - dùng chung cho tất cả các student).
    Hãy viết chương trình main() để mô tả các bước sau:
    B1: Các Student sẽ nộp quỹ, mỗi Student 100k
    B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
    B3: Student thứ 2 lấy 20k đi mua bánh mì
    B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
    B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
    In ra số tiền còn của nhóm tại mỗi bước*/
    public void question2() {
        Student[] stusents = new Student[3];
        System.out.println("Khởi tạo 3 sinh viên: ");
        for (int i = 0; i < stusents.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            Student st = new Student();
            stusents[i] = st;
        }
        //  Các Student sẽ nộp quỹ, mỗi Student 100k
        System.out.println("Các Student sẽ nộp quỹ, mỗi Student 100k: ");
        for (Student student : stusents) {
            student.setMoneyGroup(100);
        }
        //  Tong so tien cua nhom
        for (Student student : stusents) {
            Student.sumMoneyGroup += student.getMoneyGroup();
        }
        System.out.println("Tong quy:" + Student.sumMoneyGroup);

        //  Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
        System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
        Student.sumMoneyGroup -= 50;
        System.out.println(" Sau B1: ");
        System.out.println(Student.sumMoneyGroup);

        //  Student thứ 2 lấy 20k đi mua bánh mì
        System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");
        Student.sumMoneyGroup -= 20;
        System.out.println(" Sau B2: ");
        System.out.println(Student.sumMoneyGroup);

        //  Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
        System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");
        Student.sumMoneyGroup -= 150;
        System.out.println(" Sau B3: ");
        System.out.println(Student.sumMoneyGroup);

        //  Cả nhóm mỗi người lại đóng quỹ mỗi người 50k
        System.out.println("Các Student sẽ nộp quỹ, mỗi Student 50k: ");
        for (Student student : stusents) {
            student.setMoneyGroup(50);
        }
        System.out.println("Tổng quỹ hiện tại: ");
        for (Student student : stusents) {
            Student.sumMoneyGroup += student.getMoneyGroup();
        }
        System.out.println(Student.sumMoneyGroup);

//        System.out.println("Mời bạn nhập student cần kiểm tra số tiền quỹ còn lại: " +
//                "student1 nhập 1, student2 nhập 2, student3 nhập 3..vv..");
//        Scanner sc = new Scanner(System.in);
//        int choose = 0;
//        boolean isRightNumber = true;
//        while (isRightNumber) {
//            try {
//                choose = Integer.parseInt(sc.next().trim());
//                if (choose > 0 && choose <= stusents.length) {
//                    isRightNumber = false;
//                } else {
//                    System.out.println("Mời bạn nhập lại!");
//                    choose = sc.nextInt();
//                }
//            } catch (Exception e) {
//                System.out.println("Moi ban nhap so: ");
//                choose = sc.nextInt();
//            }
//
//        }
//        System.out.println(stusents[choose - 1].getMoneyGroup());

    }
}
