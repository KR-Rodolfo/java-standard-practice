package chapter11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

    public static void main(String[] args) {
        int size = 50000;

        System.out.println("== ArrayList 추가 ==");
        addFirst(new ArrayList<>(), size);
        addMiddle(new ArrayList<>(), size);
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);
        System.out.println("== LinkedList 추가 ==");
        addFirst(new LinkedList<>(), size);
        addMiddle(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);

        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, 0);
        getIndex(arrayList, size / 2);
        getIndex(arrayList, size - 1);
        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, 0);
        getIndex(linkedList, size / 2);

        System.out.println("==ArrayList 검색==");
        search(arrayList, 0);
        search(arrayList, size / 2);
        search(arrayList, size - 1);
        System.out.println("==LinkedList 검색==");
        search(linkedList, 0);
        search(linkedList, size / 2);
        search(linkedList, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    public static void addMiddle(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    public static void addLast(List<Integer> list, int size ) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("마지막에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

}
