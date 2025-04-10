package chapter08;

import java.io.File;

public class ExceptionEx15 {

    public static void main(String[] args) {
        File file = createFile(null);
        System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        } catch (Exception e) { //예외 직접 처리 -> 파일 이름은 재설정한다.
            fileName = "제목 없음.txt"; //이름 재설정
        } finally {
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }

}
