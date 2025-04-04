package chapter07.inheritance.shape;

public class DrawShape {

    public static void main(String[] args) {
        Point[] points = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };

        Triangle t = new Triangle(points);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }

}
