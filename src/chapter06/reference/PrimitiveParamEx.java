package chapter06.reference;

public class PrimitiveParamEx {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x=" + d.x);

        change(d.x);
        System.out.println("after change(d.x)");
        System.out.println("main(): x=" + d.x);
    }

    public static void change(int x) { //값이 복사되어 전달되었기 때문에 원본(d.x)와 x는 별개의 변수이다.
        x = 1000;
        System.out.println("change(): x=" + x);
    }

}
