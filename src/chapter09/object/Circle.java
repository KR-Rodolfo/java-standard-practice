package chapter09.object;

public class Circle implements Cloneable {
    Point p;
    double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    public Circle clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            return (Circle) obj;
        }

        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y); //깊은 복사로 오버라이딩 한다.

        return c;
    }

    @Override
    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.clone();

        System.out.println(c1);
        System.out.println(c2);

        c2.p.x = 2; //깊은 복사가 되어서 원본 Point 객체에 영향을 미치지 않는다.

        System.out.println(c1);
        System.out.println(c2);
    }

}
