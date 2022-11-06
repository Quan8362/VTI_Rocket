package backend;

import entity.Student2;
import utils.FileManager;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Exercise5_DemoFile_IOStream {
    /*  Question 1: Tạo class Student có property id, name.
    a) Sau đó khởi 3 instance từ console (sử dụng ScannerUtils)
    b) Write 3 student này ra file tên là StudentInformation.txt
    c) Sau đó đọc thông tin file StudentInformation.txt và in ra màn hình*/
    public static void exercise5_Question1() {
        Scanner sc = new Scanner(System.in);
        String fileName = "StudentInformation.txt";

        try {
            // Mở luồng kết nối đến file
            boolean isContinuing = false;
            FileOutputStream fos = new FileOutputStream(FileManager.PATH + "/" + fileName, isContinuing);
            ObjectOutputStream out = new ObjectOutputStream(fos);

            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập thông tin Student " + (i + 1) + " : ");
                System.out.println("Nhập ID: ");
                int id = sc.nextInt();
                System.out.println("Nhập Name: ");
                String name = sc.next();
                Student2 student2 = new Student2(id, name);
                out.writeObject(student2);
            }
            fos.close();
            out.close();
        } catch (Exception e) {
            throw new RuntimeException(FileManager.FILE_NOT_EXITS);
        }
    }
    /*  Question 2: Tạo LogUtils (sử dụng write Object Exception)
    Tạo 1 custom Exception Object, sau đó tại hàm main sẽ bắt exception
    ko mong muốn và lưu thông tin Exception.ser file
    Các bước làm sẽ như sau:
    B1: Tạo 1 object MyException sẽ extends Exception, trong
    MyException sẽ chứa các thông tin như: message, reason, StackTrace,
    time (thời gian bị Exception), ...
    B2: Sau đó tạo class LogUtils có 1 vài method như sau:
            1. void writeLog (String message, String reason, StackTrace, Datetime time)
            (gợi ý: sử dụng IOManager ở trên để write file)
            2. void writeLog (MyException exception)
    B3: đặt try catch ở method main() hoặc ở bất kỳ chỗ nào muốn lưu lại thông tin exception
    B4: Tạo method để đọc thông tin trong file Exception và in ra màn hình
    B5: Demo chương trình*/
}

