package chapter05.string;

public class ArrayEx14 {

    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i); //문자열 인덱싱
            System.out.println("src.charAt(" + i + ") = "  + src.charAt(i));
        }

        char[] charArray = src.toCharArray(); //문자열 -> 문자 배열
        System.out.println(charArray); //println은 문자 배열을 문자열처럼 출력한다.
    }

}
