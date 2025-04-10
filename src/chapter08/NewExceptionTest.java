package chapter08;

public class NewExceptionTest {

    public static void main(String[] args) {
            try {
                startInstall();
                copyFiles();
            } catch (SpaceException e) {
                System.out.println("에러 메세지: " + e.getMessage());
                e.printStackTrace();
                System.out.println("디스크 공간을 확보한 후에 다시 시도해주시길 바랍니다.");
            } catch (MemoryException e) {
                System.out.println("에러 메세지: " + e.getMessage());
                e.printStackTrace();
                System.gc();
                System.out.println("다시 설치를 시도하세요.");
                throw new RuntimeException(e);
            } finally {
                deleteTempFiles(); //자원은 무조선 해제해준다.
            }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {
        System.out.println("파일을 복사합니다.");
    }

    static void deleteTempFiles() {
        System.out.println("임시 파일을 제거합니다.");
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

    static class SpaceException extends Exception {
        public SpaceException(String message) {
            super(message);
        }
    }

    static class MemoryException extends Exception {
        public MemoryException(String message) {
            super(message);
        }
    }

}
