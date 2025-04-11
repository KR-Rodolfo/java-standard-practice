package chapter09.object;

public class EqualsEx2 {

    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);

        if (p1 == p1) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }

        if (p1.equals(p2)) { //id로 비교한다.
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }

    static class Person {
        long id;

        public Person(long id) {
            this.id = id;
        }

        //id가 같으면 같은 객체로 논리적 동일성을 부여한다.
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Person) {
                return id == ((Person) obj).id;
            } else {
                return false;
            }
        }
    }

}
