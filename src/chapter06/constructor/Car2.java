package chapter06.constructor;

public class Car2 {

    String color;
    String gearType;
    int door;

    Car2() {
        //반드시 첫줄에 위치
        this("white", "auto", 4); //기본값 설정 가능
    }

    Car2(String c) {
        this(c, "auto", 4);
    }

    Car2(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    public static void main(String[] args) {
        //생성자도 메서드이기 때문에 오버로딩이 가능하다.
        Car2 c1 = new Car2("blue");

        Car2 c2 = new Car2("white", "auto", 4);

        System.out.println("c1의 color: " + c1.color + ", gearType: " + c1.gearType + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", gearType: " + c2.gearType + ", door: " + c2.door);
    }

}
