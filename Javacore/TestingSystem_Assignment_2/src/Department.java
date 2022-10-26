import java.util.Arrays;

public class Department {
    int departmentId;

    String departmentName;
    Account[] accounts;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public Department department1() {
        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = "Sale";
        return department;
    }

    public Department department2() {
        Department department = new Department();
        department.departmentId = 2;
        department.departmentName = "Marketing";
        return department;
    }

    public Department department3() {
        Department department = new Department();
        department.departmentId = 3;
        department.departmentName = "BDO";
        return department;
    }

}