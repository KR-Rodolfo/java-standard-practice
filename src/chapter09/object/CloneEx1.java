package chapter09.object;

public class CloneEx1 {

    static class Point implements Cloneable {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x=" + x + ", y=" + y;
        }

        @Override
        public Point clone() { //공변 반환타입
            Object obj = null;
            try {
                obj = super.clone(); //기본적으로 얕은 복사가 수행된다.
                return (Point) obj;
            } catch (CloneNotSupportedException e) {
                return (Point) obj;
            }
        }
    }

    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = original.clone();

        System.out.println(copy == original);

        System.out.println(original);
        System.out.println(copy);
    }

}
