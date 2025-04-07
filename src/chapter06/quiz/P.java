package chapter06.quiz;

public class P {

    static class C extends P {

    }

    public static void main(String[] args) {
        C c = new C();

        P p = (P) c;
    }

}
