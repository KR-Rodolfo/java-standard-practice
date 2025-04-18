package chapter13;

public class ThreadEx2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();

        System.out.println("main 메서드 실행");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    static class ThreadEx2_1 extends Thread {
        @Override
        public void run() {
            //쓰레드에서 던져진 예외는 main 쓰레드에 영향을 주지 않는다.
            throwException();
        }

        public void throwException() {
            throw new RuntimeException();
        }
    }

}
