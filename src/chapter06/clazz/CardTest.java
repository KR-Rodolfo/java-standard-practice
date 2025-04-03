package chapter06.clazz;

class Card {
    String kind;
    int number;

    //class variable: 클래스에 소속된 변수(메서드 영역의 static 영역에 존재한다)
    //프로그램 실행 시 생성되고 소속 클래스로 생성한 모든 인스턴스가 공유한다.
    static int width = 100;
    static int height = 250;
}

/**
 * 예시에서는 인스턴스를 통해 클래스 변수에 접근했지만,
 * 이는 인스턴스 변수에 접근하는 것으로 혼동을 줄 수 있기 때문에 클래스 명으로 접근하는 것이 권장된다.
 */
public class CardTest {

    public static void main(String[] args) {
        //클래스 이름으로 접근 가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이고 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");

        System.out.println("c1의 width와 height를 변경합니다.");
        //c1으로 접근했지만 클래스 변수이기 때문에 c2에도 영향을 미친다.
        c1.width = 50;
        c1.height = 80;

        //c2의 width와 height도 변경된다.
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이고 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
        System.out.println("c1은 " + c2.kind + ", " + c2.number + "이고 크기는 (" + c2.width + ", " + c2.height + ") 입니다.");


    }

}
