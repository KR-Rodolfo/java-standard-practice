package chapter06.valiable_intitalization;

public class ProductTest {

    static int count = 0;
    int serialNo;

    {
        count++;
        serialNo = count;
    }

    public ProductTest() {
    }

    public static void main(String[] args) {
        ProductTest p1 = new ProductTest();
        ProductTest p2 = new ProductTest();
        ProductTest p3 = new ProductTest();

        System.out.println("p1의 제품 번호: " + p1.serialNo);
        System.out.println("p2의 제품 번호: " + p2.serialNo);
        System.out.println("p3의 제품 번호: " + p3.serialNo);

        System.out.println("제품 생산량: " + ProductTest.count);
    }

}
