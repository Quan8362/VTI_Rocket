package frontend;

import backend.Exercise1_Question2;

public class Demo_Exercise1_Question2 {
    /*    Question 2 (Optional):
    Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối
    C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa
    chỉ, mức ưu tiên.
    Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
    Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
    Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
    a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
    b) Xây dựng interface ITuyenSinh và class TuyenSinh có các
            chức năng:
                        a. Thêm mới thí sinh.
                        b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
                        c. Tìm kiếm theo số báo danh.
                        d. Thoát khỏi chương trình.*/
    public static void main(String[] args) {
        Exercise1_Question2 ex1_qs2 = new Exercise1_Question2();
        ex1_qs2.menu();
    }


}
