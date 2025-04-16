package chapter11.stackandqueue;

import java.util.Stack;

public class StackEx1 {

    public static Stack<String> back = new Stack<>();
    public static Stack<String> forward = new Stack<>();

    public static void main(String[] args) {
        goURL("인스타그램");
        goURL("페이스북");
        goURL("네이버");
        goURL("구글");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼");
        printStatus();

        goURL("codechobo.com");
        System.out.println("새로운 주소로 이동");
        printStatus();
    }

    private static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("현재 화면은 \"" + back.peek() + "\"입니다.");
        System.out.println();
    }

    private static void goURL(String url) {
        back.push(url);
    }

    private static void goBack() {
        if (back.isEmpty()) {
            return;
        }
        forward.push(back.pop());
    }

    private static void goForward() {
        if (forward.isEmpty()) {
            return;
        }
        back.push(forward.pop());
    }

}
