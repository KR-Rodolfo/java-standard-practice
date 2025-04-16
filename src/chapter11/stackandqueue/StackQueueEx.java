package chapter11.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); //Stack 클래스의 Vector에는 필수적 동기화가 걸려있어 성능 문제로 사용하지 않는다.
        Queue<String> queue = new LinkedList<>();

        stack.push("0");
        stack.push("1");
        stack.push("2");

        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        //LIFO
        System.out.println("== stack ==");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        //FIFO
        System.out.println("= queue =");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
