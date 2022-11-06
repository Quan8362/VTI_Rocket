package entity;

public class Rectangle {
    /*Question 3: This & Super, Overriding
    Tạo 1 class Rectangle có 2 method: tính chu vi và tính diện tích. Hãy implement 2 method này.
    Tiếp theo hãy tạo 1 class Square extends Rectangle, có 2 method tính chu vi và tính diện tích
    Chú ý:
    Không implement method trong class Square theo công thức tính diện tích, chu vi hình vuông
    mà sẽ gọi theo Rectangle.perimeter(), Rectangle.area() )
    Và trong mỗi method print thêm dòng "Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật"*/
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float area() {
        return a * b;
    }

    public float perimeter() {
        return (a + b) * 2;
    }
}
