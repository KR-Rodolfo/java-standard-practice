package chapter11.stackandqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {

    static Queue<String> q = new LinkedList();
    static final int MAX_SIZE = 5;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">> ");
            try {
                String input = sc.nextLine();
                
                //빈 문자열 처리
                if ("".equals(input)) {
                    continue;
                }

                if (input.equalsIgnoreCase("q")) { //q 입력 처리
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) { //help 명령어 처리
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);
                    Iterator<String> iterator = q.iterator();
                    int i = 0;
                    while (iterator.hasNext()) {
                        System.out.println(++i + ". " + iterator.next());
                    }
                } else {
                    save(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if (q.size() >= MAX_SIZE) {
            q.poll();
        }
        q.offer(input);
    }

}
