package chapter08;

public class FinallyTest2 {

    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //무조건 실행된다.
            deleteTempFiles(); //자원 해제
        }

        //자원을 무조건 해제하기 위해 try - catch 모두 내부에 deleteTempFiles 메서드를 작성했다.
    }

    static void startInstall() {
        System.out.println("프로그램 설치에 필요한 준비를 하는 코드 실행한다.");
    }

    static void copyFiles() {
        System.out.println("파일들을 복사하는 코드를 실행한다.");
    }

    static void deleteTempFiles() {
        System.out.println("임시 파일을 삭제한다.");
    }

}
