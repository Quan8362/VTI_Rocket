public class FlowControl {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "user1@gmail.com";

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "user2@gmail.com";

        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = "Sale";
        acc2.department = department;

        // add vao mang:
        Account[] accounts = {acc1, acc2};
        if (accounts[1].department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + accounts[1].department.departmentName);
        }
    }
}
