package chapter06.overloading;

public class WrongExample {

    public long add(int a, long b) {
        return a + b;
    }

    //오버로딩 불가: 반환값은 고려되지 않는다.
    //public long add(int a, long b) {
    //    return a + b;
    //}

    //매개변수의 종류와 개수는 같지만 순서가 다르기 때문에 오버로딩이 가능하다.
    public long add(long a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        WrongExample wrongExample = new WrongExample();

        //wrongExample.add(3, 3); //예외 발생: 메서드를 특정할 수 없다.
        wrongExample.add(3L, 3); //매개 변수 타입을 정확하게 명시해야 한다.
    }

}
