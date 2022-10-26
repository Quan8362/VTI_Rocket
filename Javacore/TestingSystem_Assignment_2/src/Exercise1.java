public class Exercise1 {
//  IF:
    public static void question1() {
/*      Question 1:
        Kiểm tra account thứ 2
        Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
        "Nhân viên này chưa có phòng ban"
        Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."*/

        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        if (accounts[1].department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + accounts[1].department.departmentName);
        }
    }

    static void question2() {
       /* Question 2:
        Kiểm tra account thứ 2
        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
        này là Java Fresher, C# Fresher"
        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
        quan trọng, tham gia nhiều group"
        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
        người hóng chuyện, tham gia tất cả các group"*/

        Account acc = new Account();
        Account acc2 = acc.account2();

        int soGroupCuaAccount2 = acc2.groups.length;

        if (soGroupCuaAccount2 == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (soGroupCuaAccount2 == 1 || soGroupCuaAccount2 == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (soGroupCuaAccount2 == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        /*for (Group g : acc2.groups) {
            System.out.println(g.name);
        }

        for (int i = 0; i < acc2.groups.length; i++) {
            System.out.println(acc2.groups[i].name);
        }*/

    }

    static void question3() {
        /*     Sử dụng toán tử ternary để làm Question 1*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        String a = accounts[1].department == null ? "Nhân viên này chưa có phòng ban"
                : ("Phòng ban của nhân viên này là: " + accounts[1].department.departmentName);
        System.out.println(a);
    }

    static void question4() {
       /* Question 4:
        Sử dụng toán tử ternary để làm yêu cầu sau:
        Kiểm tra Position của account thứ 1
        Nếu Position = Dev thì in ra text "Đây là Developer"
        Nếu không phải thì in ra text "Người này không phải là Developer"*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        String a = accounts[0].position.name == PositionName.DEV ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(a);
    }

    static void question5() {
       /* Question 5:
        Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
        Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
        Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
        Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
        Còn lại in ra "Nhóm có nhiều thành viên"*/

        Group group = new Group();
        Group group1 = group.groups()[0];
        Account account = new Account();
        group1.accounts = new Account[]{account.account1(), account.account2()};
        if (group1.accounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        } else {
            int soAccountCuaGroup1 = group1.accounts.length;
            switch (soAccountCuaGroup1) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }
    }

    static void question6() {
        /* Sử dụng switch case để làm lại Question 2*/

        Account acc = new Account();
        Account acc2 = acc.account2();
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int soGroupCuaAccount2 = acc2.groups.length;
            switch (soGroupCuaAccount2) {
                case 0:
                    System.out.println("Nhân viên này chưa có group");
                    break;
                case 1:
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                case 4:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
    }

    static void question7() {
        /*  Sử dụng switch case để làm lại Question 4*/

        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        String positionName = accounts[0].position.name.toString();
        switch (positionName) {
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }
//  FOREACH:
    static void question8() {
/*      Question 8:
        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        for (Account acc : accounts) {
            System.out.println("AccountId: " + acc.id + ", Email: "
                    + acc.email + ", Name: " + acc.userName + ", Department: " + acc.department.departmentName);
        }
    }

    static void question9() {
/*      Question 9:
        In ra thông tin các phòng ban bao gồm: id và name*/
        Department department = new Department();
        Department[] departments = {department.department1(), department.department2()};
        for (Department dep : departments) {
            System.out.println("DepartmentId: " + dep.departmentId + ", Name: "
                    + dep.departmentName);
        }
    }
//  FOR:
    static void question10() {
/*      Question 10:
        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
        họ theo định dạng như sau:
        Thông tin account thứ 1 là:
        Email: NguyenVanA@gmail.com
        Full name: Nguyễn Văn A
        Phòng ban: Sale
        Thông tin account thứ 2 là:
        Email: NguyenVanB@gmail.com
        Full name: Nguyễn Văn B
        Phòng ban: Marketting*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2()};
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
        }
    }

    static void question11() {
/*      Question 11:
        In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
        Thông tin department thứ 1 là:
        Id: 1
        Name: Sale
        Thông tin department thứ 2 là:
        Id: 2
        Name: Marketing*/
        Department department = new Department();
        Department[] departments = {department.department1(), department.department2(), department.department3()};
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].departmentId);
            System.out.println("    Name: " + departments[i].departmentName);
        }
    }

    static void question12() {
/*      Question 12:
        Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10*/
        Department department = new Department();
        Department[] departments = {department.department1(), department.department2(), department.department3()};
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
        }
    }

    static void question13() {
/*      Question 13:
        In ra thông tin tất cả các account ngoại trừ account thứ 2*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        for (int i = 0; i < accounts.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Department: " + accounts[i].department.departmentName);
            }
        }
    }

    static void question14() {
/*      Question 14:
        In ra thông tin tất cả các account có id < 4*/
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Department: " + accounts[i].department.departmentName);
            }
        }
    }

    static void question15() {
/*      Question 15:
        In ra các số chẵn nhỏ hơn hoặc bằng 20*/
        System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
/*  WHILE
    Question 16:
    Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue*/
    static void question16_10() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
            i++;
        }
    }

    static void question16_12() {
        Department department = new Department();
        Department[] departments = {department.department1(), department.department2(), department.department3()};
        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
            i++;
            if (i > 1) {
                break;
            }
        }
    }

    static void question16_13() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
            i++;
        }
    }

    static void question16_14() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        while (i < accounts.length) {

            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Department: " + accounts[i].department.departmentName);
            }
            i++;
        }
    }
/*  DO-WHILE
    Question 17: Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với lệnh break, continue*/
    static void question17_10() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
            i++;
        } while (i < accounts.length);
    }
    static void question17_12() {
        Department department = new Department();
        Department[] departments = {department.department1(), department.department2(), department.department3()};
        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
            i++;
            if (i > 1) {
                break;
            }
        } while (i < departments.length);
    }
    static void question17_13() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        do {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.departmentName);
            i++;
        } while (i < accounts.length);
    }
    static void question17_14() {
        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        int i = 0;
        do {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Department: " + accounts[i].department.departmentName);
            }
            i++;
        } while (i < accounts.length);
    }
    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11();
//        question12();
//        question13();
//        question14();
//        question15();
//        question16_10();
//        question16_12();
//        question16_13();
//        question16_14();
//        question17_10();
//        question17_12();
//        question17_13();
//        question17_14();
    }
}
