package chapter05.muti_d_array;

public class ArrayEx18 {

    public static void main(String[] args) {
        //int형 2차원 배열 생성
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        int sum = 0;
        for (int i = 0; i < score.length; i++) { //score.length: score 배열 자체의 길이
            for (int j = 0; j < score[i].length; j++) { //score[i].length: i번째 있는 참조값이 가르키는 배열의 길이
                System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
            }
        }

        //향상된 for문으로도 다차원 배열을 순회할 수 있다.
        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }

}
