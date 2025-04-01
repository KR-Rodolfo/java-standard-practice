package chapter05.quiz;

import java.util.Arrays;

public class Q1 {

    //야구 게임
    public static void main(String[] args) {
        int[] user1 = {1, 2, 3};
        int[] user2 = {1, 3, 2};

        int s = 0;
        int b = 0;

        //strike
        for (int i = 0; i < user1.length; i++) {
            if (user1[i] == user2[i]) {
                s++;
            }
        }

        //ball
        for (int i = 0; i < user1.length; i++) {
            for (int j = 0; j < user2.length; j++) {
                if (i == j) {
                    continue; //스트라이크의 경우 제거
                }
                if (user1[i] == user2[j]) {
                    b++;
                }
            }
        }

        System.out.println(s + "S " + b + "B");
    }

}
