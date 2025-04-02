package chapter06.reference;

public class ReferenceParamEx {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x=" + d.x); //10

        change(d);
        System.out.println("after change(d)");
        System.out.println("main(): x=" + d.x); //1000
    }

    public static void change(Data d) { //참조값이 복사되어 전달된다.
        //매개변수 d에 참조값이 복사되었기 때문에 main 메서드의 d와 같은 주소를 가르킨다.
        d.x = 1000;
        System.out.println("change(): x=" + d.x);
    }

}
