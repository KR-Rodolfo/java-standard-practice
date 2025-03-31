package chapter04._for;

public class FlowEx22 {

    public static void main(String[] args) {
        //향상된 for문
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //배열 또는 컬렉션을 순회하면서 원소들을 가져온다.
        //무조건 배열 또는 컬렉션의 마지막까지 순회한다.
        for (int tmp : arr) {
            System.out.print(tmp + " ");
            sum += tmp;
        }
        System.out.println();

        System.out.println("sum = " + sum);
    }

}
