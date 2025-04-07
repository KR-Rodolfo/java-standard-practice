package chapter06.quiz;

public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1) {
        double distanceX = x - x1;
        double distanceY = y - y1;

        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

}
