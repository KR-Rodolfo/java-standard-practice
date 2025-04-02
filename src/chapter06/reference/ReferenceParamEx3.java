package chapter06.reference;

public class ReferenceParamEx3 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};

        //arr는 참조 변수이기 때문에 메서드 내부에서 접근해 변경할 수 있다.
        printArr(arr);
        sortArr(arr);
        printArr(arr);

        System.out.println("sum=" + sumArr(arr));
    }

    private static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }


}
