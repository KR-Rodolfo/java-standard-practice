package chapter07._super;

public class PointTest2 {

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.getLocation());
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        String getLocation() {
            return "x: " + x + ", y: " + y;
        }
    }

    static class Point3D extends Point {
        int z;

        Point3D() {
            this(100, 200, 300); //super()를 위임한다.
        }

        Point3D(int x, int y, int z) {
            super(x, y); //반드시 명시해줘야 한다.
            this.z = z;
        }

        @Override
        String getLocation() {
            return "x: " + x + ", y: " + y + ", z: " + z;
        }
    }

}
