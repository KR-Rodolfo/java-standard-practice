package chapter11.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx2 {

    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(10);
        List<Integer> copy1 = new ArrayList<>(10);
        List<Integer> copy2 = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            original.add(i);
        }


        Iterator<Integer> iterator1 = original.iterator();
        while (iterator1.hasNext()) {
            copy1.add(iterator1.next());
        }

        Iterator<Integer> iterator2 = original.iterator();
        while (iterator2.hasNext()) {
            copy2.add(iterator2.next());
            iterator2.remove(); //next()로 읽어온 요소를 삭제한다.
        }

        System.out.println("original = " + original);
        System.out.println("copy1 = " + copy1);
        System.out.println("copy2 = " + copy2);
    }

}
