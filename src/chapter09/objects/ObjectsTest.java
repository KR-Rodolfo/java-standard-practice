package chapter09.objects;

import java.util.Arrays;
import java.util.Objects;

public class ObjectsTest {

    public static void main(String[] args) {
        String[][] str2D_1 = new String[][]{
                {"aaa", "bbb"},
                {"AAA", "BBB"}
        };

        String[][] str2D_2 = new String[][]{
                {"aaa", "bbb"},
                {"AAA", "BBB"}
        };

        for (String[] tmp : str2D_1) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println();

        for (String[] tmp : str2D_2) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println();

        System.out.println(Objects.equals(str2D_1, str2D_2));
        System.out.println(Objects.deepEquals(str2D_1, str2D_2));

        System.out.println(Objects.isNull(null));
        System.out.println(Objects.nonNull(null));

        System.out.println(Objects.hashCode(null));
        System.out.println(Objects.toString(null));
    }

}
