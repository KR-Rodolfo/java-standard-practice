package chapter08;

public class ChainedExceptionEx {

    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (MemoryException | SpaceException e) {
            throw new InstallException("설치중 예외 발생", e); //예외를 변환한다. (체크 예외를 -> 런타임 예외로 변환할 수도 있다.)
        } finally {
            deleteCopyFiles();
        }
    }

    static void startInstall() throws MemoryException, SpaceException {
        if (!isEnoughMemory()) {
            throw new MemoryException("메모리 공간이 부족합니다.");
        }

        if (!isEnoughSpace()) {
            throw new SpaceException("디스크 공간이 부족합니다.");
        }
    }

    static void copyFiles() {
        System.out.println("설치를 위해 필요한 파일을 복사합니다.");
    }

    static void deleteCopyFiles() {
        System.out.println("임시 파일들을 삭제합니다.");
    }

    static boolean isEnoughMemory() {
        return true;
    }

    static boolean isEnoughSpace() {
        return false;
    }

    //Exception
    static class InstallException extends Exception {
        public InstallException(String message, Throwable cause) {
            super(message, cause);
        }
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
