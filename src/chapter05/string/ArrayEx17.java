package chapter05.string;

public class ArrayEx17 {

    public static void main(String[] args) {
        if (args.length != 3) { //커맨드 라인 인자를 3개 넘겨줄 것을 강제한다.
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0); //프로그램 종료
        }

        //문자열을 적절하게 캐스팅한다.
        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }

        System.out.println("걸과: " + result);
    }

}
