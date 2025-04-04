package chapter06.quiz;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(mid(1, 2, 3));
        System.out.println(mid(2, 1, 3));
        System.out.println(mid(1, 2, 2));
        System.out.println(mid(1, 1, 2));
    }

    private static int mid(int a, int b, int c) {
        if (a > b) {
            if (a < c) {
                return a;
            } else if (c > b) {
                return b;
            } else {
                return c;
            }
        } else {
            if (c > b) {
                return b;
            } else {
                if (a > c) {
                    return a;
                } else {
                    return b;
                }
            }
        } 
    }

}
