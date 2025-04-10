package chapter08;

public class ExceptionEx11 {

    public static void main(String[] args) {
        //언체크(런타임) 예외이기 때문에 메서드 밖으로 던지거나 메서드 내부에서 처리해줘야 한다. -> 런타임 에러, 컴파일은 가능
        throw new RuntimeException();
    }

}
