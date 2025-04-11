package chapter09.object;

public class EqualsEx1 {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        //Object 클래스에 정의된 equals 메서드는 참조값을 비교한다.
        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        v1 = v2;

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    }

    static class Value {
        int value;

        public Value(int value) {
            this.value = value;
        }
    }

}
