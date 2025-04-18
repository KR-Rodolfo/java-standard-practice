package chapter11.stackandqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    public static void main(String[] args) {
        //PriorityQueue: 힙 자료구조 이용
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        pq.offer(0);
        System.out.println(pq);

        //iterator
        Iterator<Integer> iterator = pq.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(++i + ". " + iterator.next());
        }

        //enhanced for
        int j = 0;
        for (Integer num : pq) {
            System.out.println(++j + ". " + num);
        }
    }

}
