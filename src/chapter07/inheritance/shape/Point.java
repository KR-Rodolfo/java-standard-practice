package chapter07.inheritance.shape;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        return "(" + x + ", " + y + ")";
    }

}
