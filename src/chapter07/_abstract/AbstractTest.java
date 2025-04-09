package chapter07._abstract;

public class AbstractTest {

    static abstract class Unit {
        int x;
        int y;

        //추상 메서드: 메서드 선언부만 작성 -> 반드시 자식에서 오버라이딩 한다.
        abstract void move(int x, int y);
    }

    static class Marin extends Unit {
        @Override
        void move(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println("marin work to (" + x + ", " + y + ")");
        }
    }

    static class Tank extends Unit {
        @Override
        void move(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println("Tank drive to (" + x + ", " + y + ")");
        }
    }

    public static void main(String[] args) {
        //추상 클래스도 클래스이기 상속되고 다형성이 적용된다.
        Unit[] units = new Unit[2];
        Unit marin = new Marin();
        Unit tank = new Tank();

        units[0] = marin;
        units[1] = tank;

        for (int i = 0; i < 2; i++) {
            units[i].move(10, 20);
        }
    }

}
