import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    int id; // 0

    String email; // null

    String userName;

    String fullName;

    Department department;

    Position position;

    LocalDate createDate;

    float salary;
    Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
    public Account account1() {
        Account account = new Account();
        account.id = 5;
        account.email = "vti1@gmail.com";
        account.userName = "username1";
        account.fullName = "Trần Bình Minh";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[0], group.groups()[2]};
        Department department = new Department();
        account.department = department.department1();
        Position position = new Position();
        account.position = position.position1();
        account.createDate = LocalDate.now();
        return account;
    }
    public Account account2() {
        Account account = new Account();
        account.id = 2;
        account.email = "vti2@gmail.com";
        account.userName = "username2";
        account.fullName = "Lương Thu Trang";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[1], group.groups()[0]};
        Department department = new Department();
        account.department = department.department3();
        account.createDate = LocalDate.now();
        return account;
    }
    public Account account3() {
        Account account = new Account();
        account.id = 4;
        account.email = "vti3@gmail.com";
        account.userName = "username3";
        account.fullName = "Lee Thanh Tung";
        Group group = new Group();
        account.groups = new Group[]{group.groups()[1], group.groups()[2]};
        Department department = new Department();
        account.department = department.department2();
        account.createDate = LocalDate.now();
        return account;
    }
}
