import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    /*    Question 2: Tiếp tục Question 1
        Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
        hiện các chức năng sau:
        a) Thêm mới cán bộ.
        b) Tìm kiếm theo họ tên.
        c) Hiện thị thông tin về danh sách các cán bộ.
        d) Nhập vào tên của cán bộ và delete cán bộ đó
        e) Thoát khỏi chương trình.*/
    private Scanner sc;
    public ArrayList<Staff> stafflist;

    public Exercise5() {
        sc = new Scanner(System.in);
        stafflist = new ArrayList<Staff>();
    }

    public void menu() {
        while (true) {
            System.out.println("======================================================================");
            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
            System.out.println("===              1. Thêm mới cán bộ.                               ===");
            System.out.println("===              2. Tìm kiếm theo họ tên.                          ===");
            System.out.println("===              3. Hiện thị thông tin về danh sách các cán bộ.    ===");
            System.out.println("===              4. Nhập vào tên của cán bộ và delete cán bộ đó    ===");
            System.out.println("===              5. Thoát khỏi chương trình.                       ===");
            System.out.println("======================================================================");

            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    printListStaff();
                    break;
                case 4:
                    deleteByName();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("choose again!");
                    break;
            }
        }
    }

    private void deleteByName() {
        System.out.println("Nhap ten can bo can delete: ");
        String name = sc.nextLine();
        stafflist.removeIf(staff -> staff.getName().equals(name) );

    }

    private void printListStaff() {
        for (Staff staff : stafflist
        ) {
            System.out.println(staff.toString());
        }
    }

    private void findByName() {
        System.out.println("Nhap vao ten muon tim kiem: ");
        String name = sc.next();
        for (Staff staff:stafflist
             ) {
            if (staff.getName().equals(name)){
                System.out.println(staff);
            }
        }
    }

    private void addStaff() {
        System.out.println("----------------------------------------------------");
        System.out.println("--------Lựa chọn chức năng bạn muốn sử dụng---------");
        System.out.println("---     1. Thêm Engineer                         ---");
        System.out.println("---     2. Thêm Worker                           ---");
        System.out.println("---     3. Thêm Employeee                        ---");
        System.out.println("----------------------------------------------------");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                addEngineer();
                break;
            case 2:
                addByWorker();
                break;
            case 3:
                addByEmployeee();
                break;
            default:
                System.out.println("choose again!");
                break;
        }
    }

    private void addByEmployeee() {
        System.out.println("Nhap vao ten: ");
        String name = sc.next();
        System.out.println("Nhap vao tuoi: ");
        int age = sc.nextInt();
        System.out.println("nhap vao gioi tinh: 1.Male, 2.Female, 3.Unknow");
        int choosegender = sc.nextInt();
        Gender gender = null;
        switch (choosegender) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FELMALE;
                break;
            case 3:
                gender = Gender.UNKNOWN;
                break;
            default:
                System.out.println("choose again!");
                break;
        }
        System.out.println("Nhap vao dia chi: ");
        String address = sc.next();
        System.out.println("nhap vao cong viec: ");
        String task = sc.next();

        Staff employee = new Employee(name, age, gender, address, task);
        stafflist.add(employee);

    }

    private void addByWorker() {
        System.out.println("Nhap vao ten cong nhan: ");
        String name = sc.next();
        System.out.println("Nhap vao tuoi cong nhan: ");
        int age = sc.nextInt();
        System.out.println("Nhap vao gioi tinh: 1.Male, 2.Female, 3.Unknow");
        int choosegender = sc.nextInt();
        Gender gender = null;
        switch (choosegender) {
            case 1:
                gender = Gender.FELMALE;
                break;
            case 2:
                gender = Gender.FELMALE;
                break;
            case 3:
                gender = Gender.UNKNOWN;
                break;
            default:
                System.out.println("choose again!");
                break;
        }
        System.out.println("Nhap vao dia chi: ");
        String address = sc.next();
        System.out.println("nhap vao cap bac cong nhan: ");
        int rank = sc.nextInt();
        Staff worker = new Worker(name, age, gender, address, rank);
        stafflist.add(worker);
    }

    private void addEngineer() {
        System.out.println("Nhap vao ten ky su: ");
        String name = sc.next();
        System.out.println("Nhap vao tuoi cua ky su: ");
        int age = sc.nextInt();
        System.out.println("nhap vao gioi tinh: 1.Male, 2.Female, 3.Unknow");
        int chooseGender = sc.nextInt();
        Gender gender = null;
        switch (chooseGender) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FELMALE;
                break;
            case 3:
                gender = Gender.UNKNOWN;
                break;
            default:
                System.out.println("choose again!");
                break;
        }
        System.out.println("Nhap vao dia chi cua ky su: ");
        String address = sc.next();
        System.out.println("Nhap vao nganh cua ky su: ");
        String specialized = sc.next();
        Staff engineer = new Engineer(name, age, gender, address, specialized);
        stafflist.add(engineer);
    }
}
