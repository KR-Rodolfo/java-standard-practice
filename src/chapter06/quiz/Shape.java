package chapter06.quiz;

public abstract class Shape {

    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }

    static class Circle extends Shape {
        double r;

        Circle(double r) {
            this.r = r;
        }

        @Override
        double calcArea() {
            return r * r * Math.PI;
        }
    }

    static class Rectangle extends Shape {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double calcArea() {
            return width * height;
        }

        boolean isSquare() {
            return width == height;
        }
    }

    static class Point {
        int x;
        int y;

        public Point() {
            this(0, 0);
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[" + x + ", " + y + "]";
        }

    }

    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape shape : arr) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합: "+ sumArea(arr));
    }
}
