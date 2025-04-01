package chapter05.muti_d_array;

public class ArrayEx19 {

    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int korTotal = 0, enTotal = 0, mathTotal = 0;

        for (int i = 0; i < score.length; i++) {
            int sum = 0; //개인별 총점
            float avg = 0f; //개인별 평균
            
            //각 과목의 총합
            korTotal += score[i][0];
            enTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.println("============================================");
            System.out.println("번호 국어 영어 수학 총점 평균");

            System.out.printf("%3d", i + 1); //학생의 번호
            for (int j = 0; j < score[i].length; j++) { //각 학생의 성적의 총합을 구한다.
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = (float) sum / score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        System.out.println("============================================");
        System.out.printf("총점:%3d %4d %4d\n", korTotal, enTotal, mathTotal);
    }

}
