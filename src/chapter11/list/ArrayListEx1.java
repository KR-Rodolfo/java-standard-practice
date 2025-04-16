package chapter11.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>(10);
        list1.add(5);
        list1.add(10);
        list1.add(6);
        list1.add(8);
        list1.add(0);
        list1.add(1);

        ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
        print(list1, list2);

        //자연 순서
        Collections.sort(list1);
        Collections.sort(list2);
        
        System.out.println(list1.containsAll(list2)); //true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");

        list2.add(3, "AA");

        System.out.println(list1.retainAll(list2)); //true

        print(list1, list2);

        for (int i = list2.size() - 1; i >= 0; i--) { //뒤에서부터 삭제해야 배열의 요소의 위치가 변경되지 않는다.
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }

        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }

}
