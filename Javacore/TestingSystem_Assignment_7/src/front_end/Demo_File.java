package front_end;

import utils.FileManager;

public class Demo_File {
    public static void main(String[] args) throws Exception {
        FileManager fileManager = new FileManager();
//        fileManager.createNewFile();
//        fileManager.deleteFile();
//        System.out.println(fileManager.isFileExists());
//        fileManager.isFolder();
//        System.out.println(fileManager.isFolderExists());
        fileManager.createNewFolder();
    }
}
