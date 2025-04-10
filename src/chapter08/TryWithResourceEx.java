package chapter08;

public class TryWithResourceEx {

    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (WorkException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (WorkException e) {
            e.printStackTrace();
        }
    }

    static class CloseableResource implements AutoCloseable {
        public void exceptionWork(boolean exception) throws WorkException {
            System.out.println("exceptionWork(" + exception + ") 가 호출됨");
            if (exception) {
                throw new WorkException("WorkException 발생!!");
            }
        }

        @Override
        public void close() throws CloseException { //try문을 벗어나는 순간 자동으로 실행된다.
            System.out.println("close()가 호출됨");
            throw new CloseException("CloseException 발생!!");
        }
    }

    static class WorkException extends Exception {
        public WorkException(String message) {
            super(message);
        }
    }

    static class CloseException extends Exception {
        public CloseException(String message) {
            super(message);
        }
    }

}
