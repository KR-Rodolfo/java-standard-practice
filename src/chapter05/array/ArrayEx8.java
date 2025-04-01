package chapter05.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx8 {

    //섞기
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Random().nextInt(45) + 1;
        }

        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = new Random().nextInt(45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("ball[" + i + "] = " + ball[i]);
        }
    }

}

