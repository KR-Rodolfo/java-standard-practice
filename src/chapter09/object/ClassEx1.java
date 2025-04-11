package chapter09.object;

public class ClassEx1 {

    static class Card {
        String kind;
        int num;

        public Card() {
            this("SPADE", 1);
        }

        public Card(String kind, int num) {
            this.kind = kind;
            this.num = num;
        }

        @Override
        public String toString() {
            return "kind=" + kind + ", num=" + num;
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Card c1 = new Card("HEART", 3);

        //클래스 객체에는 클래스에 관한 모든 정보가 들어있다.

        //클래스 객체를 생성하는 3가지 방법
        Class class1 = c1.getClass(); //1. 인스턴스를 통해 클래스 객체 생성
        Class class2 = Card.class; //2. 클래스 리터럴을 통해 클래스 객체 생성
        
        //동적으로 클래스 객체 생성 가능
        Class class3 = Class.forName("chapter09.object.ClassEx1$Card"); //3. 클래스 이름으로 클래스 객체 생성
    }

}
