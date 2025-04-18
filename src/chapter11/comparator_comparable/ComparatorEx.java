package chapter11.comparator_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); //자연 순서로 정렬(Comparable)
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); //새로운 기준(Comparator) 전달
        System.out.println("strArr = " + Arrays.toString(strArr));
    }

    private static class Descending implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2) * -1;
        }
    }

}
