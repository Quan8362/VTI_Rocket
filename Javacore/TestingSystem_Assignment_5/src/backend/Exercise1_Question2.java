package backend;

import entity.Square;
import entity.TuyenSinh;

import java.util.Scanner;

public class Exercise1_Question2 {
    private Scanner sc;
    private TuyenSinh tuyenSinh;

    public Exercise1_Question2() {
        sc = new Scanner(System.in);
        tuyenSinh = new TuyenSinh();
    }
    public void menu(){
        while (true) {
            System.out.println("==================================================================");
            System.out.println("=======        LỰA CHỌN CHỨC NĂNG MONG MUỐN SỬ DỤNG        =======");
            System.out.println("==================================================================");

            System.out.println("======== 1.Thêm mới thí sinh.                             ========");

            System.out.println("======== 2.Hiện thị thông tin của thí sinh và khối thi.   ========");

            System.out.println("======== 3.Tìm kiếm theo số báo danh.                     ========");

            System.out.println("======== 4.Thoát khỏi chương trình.                       ========");

            System.out.println("==================================================================");

            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    tuyenSinh.addContestant();
                    break;
                case 2:
                   tuyenSinh.showInfoContestant();
                    break;
                case 3:
                    System.out.println("Mời bạn nhập ID cần tìm kiếm: ");
                    int idNumber;
                    idNumber = sc.nextInt();
                    tuyenSinh.findByIdNum(idNumber);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Thông báo: Lựa chọn đúng số trên menu");
                    break;
            }
        }
    }
}
