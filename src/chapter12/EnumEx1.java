package chapter12;

public class EnumEx1 {

    enum Direction {
        EAST, SOUTH, WEST, NORTH;
    }

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1); //toString()이 오버라이딩 되어 있다.
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("(d1 == d2) = " + (d1 == d2));
        System.out.println("(d1 == d3) = " + (d1 == d3)); //상수이기 때문에 주소값이 일치한다.

        System.out.println("(d1.equals(d3)) = " + (d1.equals(d3)));

        switch (d1) {
            case EAST:
                System.out.println("The direction is EAST");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH");
                break;
            case NORTH:
                System.out.println("The direction is NORTH");
                break;
            case WEST:
                System.out.println("The direction is WEST");
                break;
        }

        Direction[] values = Direction.values(); //상수 배열 반환
        for (Direction value : values) {
            //enum 타입의 ordinal 순서는 변경 가능성이 커 거의 사용되지 않는다. -> 순서가 필요할 경우 멤버 변수를 이용한다.
            System.out.println(value.name() + " : " + value.ordinal());
        }
    }

}
