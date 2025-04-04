package chapter06.valiable_intitalization;

public class BlockTest {

    static { //1. 클래스 로딩시 실행
        System.out.println("static {}");
    }

    { //2. 인스턴스 생성시 실행
        System.out.println("{}");
    }

    public BlockTest() { //3. 인스턴스 생성시 실행(인스턴스 초기화 블록 이후에 실행)
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt1 = new BlockTest();");
        BlockTest bt1 = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();

    }

}
