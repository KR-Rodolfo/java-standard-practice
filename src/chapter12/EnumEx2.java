package chapter12;

public class EnumEx2 {

    enum Direction {
        EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

        private int value;
        private String symbol;
        private static final Direction[] dirArr = Direction.values();

        Direction(int value, String symbol) {
            this.value = value;
            this.symbol = symbol;
        }

        public int getValue() {
            return value;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Direction of(int dir) {
            if (!(1 <= dir && dir <= 4)) {
                throw new IllegalArgumentException("Invalid value: " + dir);
            }
            return dirArr[dir - 1];
        }

        public Direction rotate(int num) {
            num %= 4;

            if (num < 0) {
                num += 4;
            }
            return dirArr[(value - 1 + num) % 4];
        }

        @Override
        public String toString() {
            return name() + getSymbol();
        }
    }

    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            System.out.println(d.name() + "=" + d.getValue());
        }

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.println(d1.name() + "=" + d1.getValue());
        System.out.println(d2.name() + "=" + d2.getValue());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));
    }

}
