package chapter13;

public class ThreadEx3 {

    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }

    static class ThreadEx3_1 extends Thread {
        @Override
        public void run() {
            throwException();
        }

        public void throwException() {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace(); //메인 메서드에서 실행했기 때문에 호출 스택에 메인 메서드가 찍힌다.
            }
        }
    }

}
