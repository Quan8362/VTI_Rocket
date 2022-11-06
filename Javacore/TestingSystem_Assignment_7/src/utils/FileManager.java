package utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static final String PATH = "G:/VTI_JavaWebFullStack/Javacore/File1";

    public static final String FILE_EXITS = "Error! File Exist.";

    public static final String FILE_NOT_EXITS = "Error! File Not Exist.";

    public static final String FOLDER_EXITS = "Error! Folder Exist.";

    public static final String FOLDER_NOT_EXITS = "Error! Folder Not Exist.";

    /* Question 1: Check File is exists
     Tạo 1 method có đầu vào là String path để check xem path đó có tồn
     tại hay không. VD: path = "C:\Users\pc\Desktop\Test.txt"
     Gợi ý: Tạo method boolean isFileExists(String pathFile)*/
    public boolean isFileExists() {
        String fileName = "Test.txt";
        File file = new File(PATH, fileName);
        return ((file.exists()) ? true : false);
    }

    public boolean isFolderExists() {
        String folderName = "FolderDemo";
        File file = new File(PATH, folderName);
        return ((file.isDirectory()) ? true : false);
    }

    /*  Question 2: Create new file
    Tạo 1 method để có thể tạo được file.
    Chú ý:
    Kiểm tra xem file đã tồn tại hay chưa, nếu file đã tồn tại thì sẽ throw ra Exception "Error! File Exist."
    Gợi ý: Tạo method void createNewFile(String pathFile)
    Vào tạo thêm method void createNewFile(String path, StringbfileName)*/
    public void createNewFile() throws Exception {
        String fileName = "demo.txt";
        File file = new File(PATH, fileName);
        if (isFileExists()) {
            throw new Exception(FILE_EXITS);
        }
        file.createNewFile();

        System.out.println("Create New File Susscesfuly!");

    }

    /*  Question 4: Delete file
    Tạo 1 method để có thể delete file
    Chú ý: Kiểm tra xem file đã tồn tại hay chưa, nếu file chưa tồn tại thì
    sẽ throw ra Exception "Error! File Not Exist."
    Gợi ý: Tạo method void deleteFile(String pathFile)*/
    public void deleteFile() throws Exception {
        String fileName = "demo.txt";
        File file = new File(PATH, fileName);
        if (isFileExists()) {
            file.delete();
        } else {
            throw new Exception(FILE_NOT_EXITS);
        }
    }

    /* Question 5: Check path is File or Folder
     Tạo 1 method để kiểm tra xem path có thể là File hay Folder.
     Gợi ý: Tạo method boolean isFolder(String path)*/
    public void isFolder() {
        File file = new File(PATH);
        if (file.isDirectory()) {
            System.out.println("Đây là 1 Foder");
        } else {
            System.out.println("Đây là 1 File");
        }
    }

    /*  Question 10: Create new folder
    Tạo 1 method để có thể tạo được folder.
    Chú ý: Kiểm tra xem folder đã tồn tại hay chưa, nếu folder đã tồn tại
    thì sẽ throw ra Exception "Error! Folder Exist."
    Gợi ý: Tạo method void createNewFolder(String newPathFolder)*/
    public void createNewFolder() throws Exception {
        String folderName = "FolderDemo";
        File file = new File(PATH, folderName);
        if (isFolderExists()) {
            throw new Exception(FOLDER_EXITS);
        }
        file.mkdir();
    }
}
