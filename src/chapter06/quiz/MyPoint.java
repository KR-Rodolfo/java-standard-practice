package chapter06.quiz;

public class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {
        double distanceX = this.x - x;
        double distanceY = this.y - y;

        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }

}
