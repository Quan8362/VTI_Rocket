import java.time.LocalDate;
import java.util.Scanner;

public class Exercise4_String {
    /*  Question 1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó
            (các từ có thể cách nhau bằng nhiều khoảng trắng );*/
    static void question1() {
        System.out.println("====================== question 1 ======================");
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Nhap vao mot xau ki tu: ");
        a = sc.nextLine();
        String[] words = a.split(" ");
        int dem = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                dem++;
            }
        }
        System.out.println("So luong cac tu trong xau ky tu: " + dem);
        sc.close();
    }

    //    Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    static void question2() {
        System.out.println("====================== question 2 ======================");
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Nhap vao mot xau ki tu s1: ");
        s1 = sc.next();
        sc.nextLine();
        System.out.println("Nhap vao mot xau ki tu s2: ");
        s2 = sc.nextLine();
        String s3 = s1.concat(s2);
        System.out.println("Chuoi sau khi duoc noi: " + s3);
        sc.close();
    }

    /*  Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
        viết hoa chữ cái đầu thì viết hoa lên*/
    static void question3() {
        System.out.println("====================== question 3 ======================");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        // nguyen van a  => Nguyen Van A
        String[] names = name.split(" ");
        String nameResult ="";
        for (String ten : names) {
            String firstCharacter = ten.substring(0, 1).toUpperCase();
            String rightCharacter = ten.substring(1);
            ten = firstCharacter + rightCharacter;
            //noi cac chu lai
            nameResult = nameResult + " " + ten;
        }
        System.out.println("Ten sau khi viet hoa chu cai dau: " + nameResult.trim());
        sc.close();
    }

    /*  Question 4:
    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
    VD: Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M" */
    static void question4() {
        System.out.println("====================== question 4 ======================");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhap vao ten cua ban: ");
        name = sc.nextLine();
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ky tu thu " + (i + 1) + " la: " + name.charAt(i));
        }
    }

    /*  Question 5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên
        và hệ thống sẽ in ra họ và tên đầy đủ*/
    static void question5() {
        System.out.println("====================== question 5 ======================");
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vào họ: ");
        firstName = sc.nextLine();
// nguyen van
        System.out.print("Nhập vào tên: ");
        lastName = sc.nextLine();
        System.out.print("Nhap so bat ki");
        int random = sc.nextInt();
        // 2022-10-30
        // nhap nam , nhap thang, nhap ngay
        System.out.print("Nhập nam: ");
        int nam = sc.nextInt();
        System.out.print("Nhập thang: ");
        int thang = sc.nextInt();
        System.out.print("Nhập ngay: ");
        int ngay = sc.nextInt();
        LocalDate date = LocalDate.of(nam, thang, ngay);
        System.out.print("Họ và tên đầy đủ: " + firstName.concat(" ").concat(lastName));
        sc.close();
    }

    static void question6() {
        System.out.println("====================== question 6 ======================");
        String fullName;
        String lastName = "";
        String middleName = "";
        String firstName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên đầy đủ:");
        fullName = scanner.nextLine();
        // Chuẩn hóa xâu
        fullName = fullName.trim();
        String[] words = fullName.split(" ");
        firstName = words[0];
        lastName = words[words.length - 1];
        for (int i = 1; i <= words.length - 2; i++) {
            middleName += words[i] + " ";
        }
        System.out.println("Họ là: " + firstName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + lastName);
        scanner.close();
    }

    //    Question 8: In ra tất cả các group có chứa chữ "Java"
    static void question8() {
        System.out.println("====================== question 6 ======================");
        Group group = new Group();
        Group[] groups = group.groups();
        for (Group gr : groups) {
            if (gr.name.regionMatches(true, 0, "Java", 0, 4)) {
                System.out.println(gr);
            }
        }
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question8();
    }
}
