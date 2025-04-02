package chapter06.method._return;

import chapter06.reference.Data;

public class ReferenceReturnEx {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; //참조형 역시 반환할 수 있다.
    }

}
