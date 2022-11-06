package backend;

public final class MyMath {
    public final double PI = 3.14;

    public static double min(double a, double b) {
        return (a <= b) ? a : b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
    public double sum(double a){
        return a + PI;
    }
}
