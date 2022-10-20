import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Marketing";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Sale";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "BOD";

        System.out.println("========== Thông tin các phòng ban ==========");
        System.out.println(dep1);
        System.out.println(dep2);
        System.out.println(dep3);

        // Tạo position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.TEST;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.SCRUM_MASTER;

        Position pos4 = new Position();
        pos4.id = 4;
        pos4.name = PositionName.PM;

        System.out.println("========== Thông tin các vị trí công việc ==========");
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
        System.out.println(pos4);

        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developer";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Test";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";

        // Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "vti1@gmail.com";
        acc1.userName = "username1";
        acc1.fullName = "Trần Bình Minh";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        acc1.groups = new Group[]{group1, group2};

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "vti2@gmail.com";
        acc2.userName = "username2";
        acc2.fullName = "Lương Thu Trang";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.now();
        acc2.groups = new Group[]{group2, group3};

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "vti3@gmail.com";
        acc3.userName = "username3";
        acc3.fullName = "Đoàn Thị Linh Trang";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
        acc3.groups = new Group[]{group1, group3};

        System.out.println("========== Thông tin các tài khoản ==========");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}

