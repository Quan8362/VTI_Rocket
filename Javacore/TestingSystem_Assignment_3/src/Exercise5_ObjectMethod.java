public class Exercise5_ObjectMethod {
    //    Question 1: In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    static void question1() {
        System.out.println("=======================question 1=========================");
        Department department = new Department();
        System.out.println("Thong tin phong ban thu 1: " + department.department1());
    }

    //    Question 2: In ra thông tin của tất cả phòng ban (sử dụng toString());
    static void question2() {
        System.out.println("=======================question 2=========================");
        Department department = new Department();
        Department[] departments = new Department[]{department.department1(), department.department2(), department.department3()};
        for (Department dep : departments) {
            System.out.println("Thong tin tat ca cac phong ban: " + dep);
        }

    }

    //    Question 3: In ra địa chỉ của phòng ban thứ 1
    static void question3() {
        System.out.println("=======================question 3=========================");
        Department department = new Department();
        System.out.println("Dia chi cua phong ban thu 1: " + department.department1().hashCode());
    }

    //    Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    static void question4() {
        System.out.println("=======================question 4=========================");
        Department department = new Department();
        if (department.department1().departmentName.equals("Phòng A")) {
            System.out.println("Co phong ban ten la " + "Phòng A");
        } else
            System.out.println("Khong phong ban ten la " + "Phòng A");
    }

    /*  Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không
        (bằng nhau khi tên của 2 phòng ban đó bằng nhau)*/
    static void question5() {
        System.out.println("=======================question 5=========================");
        Department department = new Department();
        Department[] departments = new Department[]{department.department1(), department.department2()};
        if (departments[0].departmentName.equals(departments[1].departmentName)) {
            System.out.println("Phong ban thu 1 va phong ban thu 2 bang nhau");
        } else
            System.out.println("Phong ban thu 1 va phong ban thu 2 khong bang nhau");
    }

    /*  Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban
        theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)*/
    static void question6() {
        System.out.println("=======================question 6=========================");
        Department department = new Department();
        Department[] departments = new Department[]{department.department1(), department.department2(),
                department.department3(), department.department4(), department.department5()};
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) < 0) {
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        System.out.print("Cac phong ban sau khi sap xap la:");
        for (int i = 0; i < departments.length; i++) {
            System.out.print(departments[i].departmentName + ", ");
        }
    }

    /*  Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
    sách phòng ban được sắp xếp theo tên*/
    static void question7() {
        System.out.println("=======================question 7=========================");
        Department department = new Department();
        Department[] departments = new Department[]{department.department1(), department.department2(),
                department.department3(), department.department4(), department.department5()};
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                String[] depNames1 = departments[i].departmentName.split(" ");
                String[] depNames2 = departments[j].departmentName.split(" ");
                if (depNames1[depNames1.length-1].compareToIgnoreCase(depNames2[depNames2.length-1]) <0) {// so sanh 2 so  vs nhau Abc   <     Acd  <0
                    //3TH: = > < a vs b  a-b   neesu = nhau  tra ve 0, a>b trar ve >0, a<b   <0

                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        System.out.print("Cac phong ban sau khi sap xap la:");
        for (int i = 0; i < departments.length; i++) {
            System.out.print(departments[i].departmentName + ", ");
        }
    }

    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
        question7();
    }
}
