package chapter07._interface;

public class FighterTest {

    static class Unit {
        int currentHp;
        int x;
        int y;

        @Override
        public String toString() {
            return "Unit";
        }
    }

    static class Fighter extends Unit implements Fightable {
        @Override
        public void move(int x, int y) {
            System.out.println("Fighter move to (" + x + ", " + y + ")");
        }

        @Override
        public void attack(Unit unit) {
            System.out.println("Fighter attack " + unit);
        }
    }

    interface Movable {
        void move(int x, int y);
    }

    interface Attackable {
        void attack(Unit unit);
    }

    interface Fightable extends Movable, Attackable {
        //상위 인터페이스를 멤버 메서드를 상속받는다.
    }

    public static void main(String[] args) {
        Fighter fighter = new Fighter();

        if (fighter instanceof Unit) {
            System.out.println("Unit 클래스의 자손입니다.");
        }

        if (fighter instanceof Movable) {
            System.out.println("Movable 클래스의 자손입니다.");
        }

        if (fighter instanceof Attackable) {
            System.out.println("Attackable 클래스의 자손입니다.");
        }

        if (fighter instanceof Object) {
            System.out.println("Object 클래스의 자손입니다.");
        }
    }

}
