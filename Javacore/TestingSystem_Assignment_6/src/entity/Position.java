package entity;

public class Position {
    private static int count = 0;
    private int id;
    private PositionName positionName;

    public enum PositionName {
        Dev, Test, Scrum_Master, PM
    }

    public Position() {
        System.out.println("Chọn tên vị trí muốn nhập 1.Dev, 2.Test, 3.Scrum_Master, 4.PM : ");
        while (true) {
            count++;
            this.id = count;
            int choose = ScannerUtils.inputIntPositive();
            switch (choose) {
                case 1:
                    this.positionName = PositionName.Dev;
                    break;
                case 2:
                    this.positionName = PositionName.Test;
                    break;
                case 3:
                    this.positionName = PositionName.Scrum_Master;
                    break;
                case 4:
                    this.positionName = PositionName.PM;
                    break;
                default:
                    System.out.println("choose again!");
                    break;
            }
            System.out.println("Id: " + this.id + ", Name: " + this.positionName);
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", positionName=" + positionName +
                '}';
    }
}
