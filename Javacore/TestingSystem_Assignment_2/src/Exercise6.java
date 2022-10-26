public class Exercise6 {
    private static void question1() {
//  Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
        System.out.println("So chan nguyen duong chan nho hon 10 la:");

        for (int i = 2; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void question2(Account[] accounts) {
//  Question 2: Tạo method để in thông tin các account
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
    }

    private static void question3() {
//  Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
        System.out.println("So nguyen duong nho hon 10 la:");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
//        question1();
//        question3();

        Account account = new Account();
        Account[] accounts = {account.account1(), account.account2(), account.account3()};
        question2(accounts);
    }
}
