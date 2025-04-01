package chapter05.array;

public class ArrayEx6 {

    //최댓값과 최솟값
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        //위에서 최댓값과 최솟값의 초기값으로 score[0]을 할당했기 때문에 1부터 순회하여도 문제없다.
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }

            if (min > score[i]) {
                min = score[i];
            }
        }

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }

}
