package chapter09.string;

public class StringEx4 {

    public static void main(String[] args) {
        //문자열 변환 방법
        int iVal = 100;
        String strVal1 = String.valueOf(iVal);

        double dVal = 200.0;
        String strVal2 = dVal + "";

        System.out.println(strVal1);
        System.out.println(strVal2);

        double sum1 = Integer.parseInt("+" + strVal1) + Double.parseDouble(strVal2);
        System.out.println(sum1);

        double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);
        System.out.println(sum2);
    }

}
