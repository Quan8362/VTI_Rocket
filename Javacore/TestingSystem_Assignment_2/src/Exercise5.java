import java.util.Scanner;

public class Exercise5 {
    private static void question1() {
//  Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhap vao so nguyen thu " + (i + 1) + ": ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        }
    }

    private static void question2() {
//  Question 1: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.printf("Nhap vao so thuc thu " + (i + 1) + ": ");
            float n = sc.nextFloat();
        }
    }

    private static void question3() {
//  Question 1: Viết lệnh cho phép người dùng nhập họ và tên
        System.out.printf("Nhap vao ho va ten: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.printf("Ho va ten nguoi moi nhap vao: " + n);
    }

    public static void createAccount() {
/*      Viết lệnh cho phép người dùng tạo account (viết thành method)　Đối với property Position,
        Người dùng nhập vào 1 2 3 4 5 và vào　chương trình sẽ chuyển thành Position.Dev, Position.Test,
        Position.ScrumMaster, Position.PM　*/

        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        while (true) {
            System.out.println("Moi ban nhap vao Position cau account: \n1.Dev \n2.Test \n3.Scrum master" +
                    "\n4.PM");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Moi ban nhap vao email: ");
            account.email = sc.nextLine();
            System.out.println("Moi ban nhap vao username: ");
            account.userName = sc.nextLine();
            System.out.println("Moi ban nhap vao fullName: ");
            account.fullName = sc.nextLine();
            Position position = new Position();
            switch (a) {
                case 1:
                    position.name = PositionName.DEV;
                    break;
                case 2:
                    position.name = PositionName.TEST;
                    break;
                case 3:
                    position.name = PositionName.SCRUM_MASTER;
                    break;
                case 4:
                    position.name = PositionName.PM;
                    break;
                default:
                    position.name = PositionName.DEV;
            }
            account.position = position;
            System.out.println(account.toString());
        }
    }

    public static void createDepartment() {
    /* Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)*/
        Scanner sc = new Scanner(System.in);
        Department department = new Department();
        System.out.println("Moi ban nhap vao departmentId: ");
        department.departmentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Moi ban nhap vao departmentName: ");
        department.departmentName = sc.nextLine();
        System.out.println(department.toString());
    }

    public static void question8() {
   /*     Viết chương trình thực hiện theo flow sau:
        Bước 1: Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
        Bước 2: Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
                Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
                Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1*/

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: \n1.Create Account \n2.Create Department");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    createDepartment();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại:");
                    question8();
            }
        }
    }

    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        createAccount();
        createDepartment();
//        question8();
    }

}
