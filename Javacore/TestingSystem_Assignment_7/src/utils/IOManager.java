package utils;

import java.io.*;

public class IOManager {
    public static String fileName = "Test.txt";

    public static void readFile() throws Exception {
        try {

            // Tạo mới luồng kí tự kết nối đến file
            File file = new File(FileManager.PATH + "/" + fileName);
            // Tạo 1 object để đọc dữ liệu
//            Reader reader = new FileReader(file);
            // Tạo mới 1 luồng kết nối đến file vừa đọc
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (Exception e) {
            throw new Exception(FileManager.FILE_NOT_EXITS);
        }
    }

    public static void writeFile() {
        String content = "lam bai tap";
        try {
            // Mở luồng kết nối đến file
            boolean isContinuing = false;
            FileOutputStream fos = new FileOutputStream(FileManager.PATH + "/" + fileName, isContinuing);
            fos.write(content.getBytes());
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(FileManager.FILE_NOT_EXITS);
        }
    }

    public static void main(String[] args) throws Exception {
//        readFile();
        writeFile();
    }
}
