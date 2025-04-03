package chapter06.constructor;

public class ConstructorTest {

    static class Data1 {
        int value;
    }

    static class Data2 {
        int value;

        Data2(int x) {
            value = x;
        }
    }

    public static void main(String[] args) {
        Data1 data1 = new Data1();
        //Data2 data2 = new Data2(); //컴파일 에러: 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.
    }

}
