import java.time.LocalDate;

public class Exercise2_DefaultValue {
    /* Question 1:
     Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
     tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
              Email: "Email 1"
              Username: "User name 1"
              FullName: "Full name 1"
              CreateDate: now */
    static void question1() {
        System.out.println("Khoi tao mang Account gom 5 phan tu su dung For:");
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = "Email" + (i+1);
            account.userName = "User name" + (i+1);
            account.fullName = "Full name" + (i+1);
            account.createDate = LocalDate.now();
            System.out.println("Email: " + account.email + " User name: " + account.userName + " Full name: "
                    + account.fullName + " " + account.createDate);
        }
    }
    public static void main(String[] args) {
        question1();
    }
}

