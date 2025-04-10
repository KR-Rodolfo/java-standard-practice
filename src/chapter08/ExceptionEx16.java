package chapter08;

import java.io.File;

public class ExceptionEx16 {

    public static void main(String[] args) { //호출자인 main 메서드가 예외를 처리한다.
        try {
            File file = createFile(null); //Exception 발생
            System.out.println(file.getName() + " 파일이 정상적으로 생성되었습니다.");
        } catch (Exception e) { //예외 처리
            System.out.println(e.getMessage());
            System.out.println("다시 입력해주시길 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        //예외 검증
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다."); //메서드를 밖으로 던진다.
        }

        File file = new File(fileName);
        file.createNewFile();

        return file;
    }

}
