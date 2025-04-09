package chapter07._interface;

public class RepairableTest {

    interface Repairable { //인터페이스를 이용해 관계성이 없는 클래스를 묶어줄 수 있다.
    }

    static class Unit {
        final int MAX_HP;
        int hitPoints;

        Unit(int maxHp) {
            MAX_HP = maxHp;
        }
    }

    static class GroundUnit extends Unit {
        GroundUnit(int maxHp) {
            super(maxHp);
        }
    }

    static class AirUnit extends Unit {
        AirUnit(int maxHp) {
            super(maxHp);
        }
    }

    static class Tank extends GroundUnit implements Repairable {
        Tank() {
            super(150);
        }

        @Override
        public String toString() {
            return "Tank";
        }
    }

    static class Marine extends GroundUnit {
        Marine() {
            super(50);
        }

        @Override
        public String toString() {
            return "marine";
        }
    }

    static class SCV extends GroundUnit implements Repairable {
        SCV() {
            super(50);
        }

        void repair(Repairable repairable) {
            Unit repairableUnit = (Unit) repairable; //다운 캐스팅이 되어야 Unit의 멤버변수에 접근할 수 있다.
            while (repairableUnit.hitPoints != repairableUnit.MAX_HP) {
                repairableUnit.hitPoints++;
            }
            System.out.println(repairable + "의 수리가 끝났습니다.");
        }

        @Override
        public String toString() {
            return "SCV";
        }
    }

    static class DropShip extends AirUnit implements Repairable {
        DropShip() {
            super(125);
        }

        @Override
        public String toString() {
            return "DropShip";
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();

        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropShip);
        //scv.repair(marine);
    }

}
