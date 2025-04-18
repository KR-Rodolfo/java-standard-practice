package chapter11.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //ListIterator: 양방향으로 커서를 움직일 수 있다.
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

}
