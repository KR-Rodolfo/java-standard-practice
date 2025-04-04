package chapter07.inheritance.shape;

public class Triangle extends Shape {

    Point[] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    public void draw() {
        System.out.println("p1=" + points[0].getXY() + ", p2=" + points[1].getXY() + ", p3=" + points[2].getXY() + ", color=" + color);
    }

}
