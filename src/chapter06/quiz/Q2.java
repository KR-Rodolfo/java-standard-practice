package chapter06.quiz;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] bingo = new int[5][5];
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                bingo[i][j] = scanner.nextInt();
            }
        }

        System.out.println(bingoCnt(bingo));
    }

    public static int bingoCnt(int[][] bingo) {
        return getRowBingo(bingo) + getColumnBingo(bingo) + GetLeftUpToRightDownBingo(bingo) + GetRightUpToLeftDownBingo(bingo);
    }

    private static int getRowBingo(int[][] bingo) {
        int result = 0;

        for (int i = 0; i < bingo.length; i++) {
            int num = bingo[i][0];
            int cnt = 0;
            for (int j = 0; j < bingo[i].length; j++) {
                if (num != bingo[i][j]) {
                    break;
                }
                cnt++;
            }
            if (cnt == bingo.length) {
                result++;
            }
        }

        System.out.println("Q2.getRowBingo " + result);

        return result;
    }

    private static int getColumnBingo(int[][] bingo) {
        int result = 0;

        for (int i = 0; i < bingo.length; i++) {
            int cnt = 0;
            int num = bingo[0][i];
            for (int j = 0; j < bingo[i].length; j++) {
                if (num != bingo[j][i]) {
                    break;
                }
                cnt++;
            }
            if (cnt == bingo.length) {
                result++;
            }
        }

        System.out.println("Q2.getColumnBingo " + result);
        return result;
    }

    private static int GetLeftUpToRightDownBingo(int[][] bingo) {
        int result = 0;

        int n1 = bingo[0][0];
        int cnt = 0;
        for (int i = 0; i < bingo.length; i++) {
            if (n1 == bingo[i][i]) {
                cnt++;
            }
        }
        if (cnt == bingo.length) {
            result++;
        }

        System.out.println("Q2.GetLeftUpToRightDownBingo " + result);

        return result;
    }

    private static int GetRightUpToLeftDownBingo(int[][] bingo) {
        int result = 0;

        int num = bingo[0][bingo.length - 1];
        int cnt = 0;
        for (int i = 0; i < bingo.length; i++) {
            if (num == bingo[i][bingo.length - 1 - i]) {
                cnt++;
            }
        }

        if (cnt == bingo.length) {
            result++;
        }

        System.out.println("Q2.GetRightUpToLeftDownBingo " + result);

        return result;
    }

}
