package entity;

public class Square extends Rectangle {

    private float a;

    public Square(float a) {
        super(a, a);
        this.a = a;
    }

    @Override
    public float area() {
        return a * a;
    }

    @Override
    public float perimeter() {
        return a * 4;
    }
}
