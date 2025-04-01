package chapter05.string;

public class ArrayEx16 {

    //커맨드 라인 입력 받기
    public static void main(String[] args) {
        //args: 프로그램 실행 시 전달 받은 인수를 문자열 배열로 제공한다.
        System.out.println("매개변수의 개수: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    
}
