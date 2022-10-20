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
}
