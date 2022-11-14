package vn.com.vti.front_end;

import vn.com.vti.controller.PositionController;
import vn.com.vti.entity.Position;
import vn.com.vti.entity.PositionName;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Function {
    private PositionController positionController;
    private Scanner scanner;

    public Function() {
        this.positionController = new PositionController();
        this.scanner = new Scanner(System.in);
    }

    public void menu() throws SQLException {
        while (true) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1.Hiển thị danh sách chức vụ.");
            System.out.println("2.Thêm mới chức vụ.");
            System.out.println("3.Chỉnh sửa thông tin chức vụ.");
            System.out.println("4.Xoá chức vụ.");
            System.out.println("5.Thoát chương trình");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("Hiển thị danh sách chức vụ: ");
                    getAllPosition();
                    break;
                case 2:
                    System.out.println("Thêm mới chức vụ: ");
                    createPosition();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa thông tin chức vụ: ");
                    updatePosition();
                    break;
                case 4:
                    System.out.println("Xoá chức vụ: ");
                    deletePosition();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn đã nhập sai sự lựa chọn, vui lòng nhập lại!");
                    break;
            }
        }
    }

    public void getAllPosition() throws SQLException {
        List<Position> positions = positionController.getAllPosition();
        for (Position po : positions) {
            System.out.println(po);
        }
    }

    public void createPosition() throws SQLException {
        PositionName positionName = null;
        while (true) {
            System.out.println("Mời bạn nhập tên chức vụ: 1.PM | 2.Test | 3.Scrum Master | 4.Dev");
            int chooseName = scanner.nextInt();
            scanner.nextLine();
            switch (chooseName) {
                case 1:
                    positionName = PositionName.PM;
                    addName(positionName.name());
                    return;
                case 2:
                    positionName = PositionName.TEST;
                    addName(positionName.name());
                    return;
                case 3:
                    positionName = PositionName.SCRUM_MASTER;
                    String nameP = "SCRUM MASTER";
                    addName(nameP);
                    return;
                case 4:
                    positionName = PositionName.DEV;
                    addName(positionName.name());
                    return;
                default:
                    System.out.println("Mời bạn nhập lại:");
                    break;
            }
        }
    }

    public void addName(String name) throws SQLException {
        int rowAffect = positionController.createPosition(name);
        if (rowAffect == 0) {
            System.out.println("Thêm không thành công");
        } else {
            System.out.println("Thêm thành công");
        }
    }

    public void updatePosition() throws SQLException {
        while (true) {
            System.out.println("Mời bạn chọn ID cần sửa:");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            PositionName positionName = null;
            if (positionController.checkId(id) == true) {
                while (true) {
                    System.out.println("Mời bạn chọn tên chức vụ: 1.PM | 2.Test | 3.Scrum Master | 4.Dev");
                    int chonName = scanner.nextInt();
                    scanner.nextLine();
                    switch (chonName) {
                        case 1:
                            positionName = PositionName.PM;
                            fixName(id, positionName.name());
                            return;
                        case 2:
                            positionName = PositionName.TEST;
                            fixName(id, positionName.name());
                            return;
                        case 3:
                            positionName = PositionName.SCRUM_MASTER;
                            String nameP = "SCRUM MASTER";
                            fixName(id, nameP);
                            return;
                        case 4:
                            positionName = PositionName.DEV;
                            fixName(id, positionName.name());
                            return;
                        default:
                            System.out.println("Nhap lai:");
                            break;
                    }
                }
            } else {
                System.out.println("ID nay ko ton tai");
            }
        }
    }

    public void fixName(int id, String name) throws SQLException {
        int rowAffect = positionController.updatePosition(id, name);
        if (rowAffect == 0) {
            System.out.println("Sửa không thành công");
        } else {
            System.out.println("Sửa thành công");
        }
    }

    public void deletePosition() throws SQLException {

        while (true) {
            System.out.println("Mời bạn nhập PoitionId cần xóa: ");
            int positionId = scanner.nextInt();
            scanner.nextLine();
            if (positionController.checkId(positionId) == true) {
                int rowAffect = positionController.deletePosition(positionId);
                if (rowAffect == 0) {
                    System.out.println("Xóa không thành công");
                } else {
                    System.out.println("Xóa thành công");
                }
                return;
            } else {
                System.out.println("ID này không tồn tại");
            }
        }


    }
}
