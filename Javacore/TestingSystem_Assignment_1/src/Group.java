import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    int id;

    String name;

    Account creator;

    LocalDate createDate;

    Account[] accounts; // Lưu trữ nhưng account thuộc 1 group

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
