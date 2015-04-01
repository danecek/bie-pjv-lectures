package exceptions;

public class Point {

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;

    double slope() {
        return y / x;
        // throws the ArithmeticException iff x == 0
        // correction: (double)y/x
    }

    public static void main(String[] args) {
        Point p = new Point(0, 1);
        System.out.println(p.slope());
    }
}
