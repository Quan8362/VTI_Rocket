import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    int id;

    String name;

    LocalDate createDate;
    Account creator;


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

    public Group[] groups() {
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "1Java1";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "java2 abc";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";

        Group[] groups = {group1, group2, group3};
        return groups;
    }
}
