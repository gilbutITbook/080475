package chap_14;

import java.io.File;
import java.io.IOException;

public class _04_File {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName); // 파일을 다룰 File 객체 생성
        try {
            file.createNewFile(); // 실제 파일을 생성하는 명령
            System.out.println("파일 생성에 섬공했습니다.");
            if (file.exists()) { // 파일이 실제로 존재하는지 확인
                System.out.println("파일 이름: " + file.getName());
                System.out.println("파일 절대 경로: " + file.getAbsolutePath());
                System.out.println("파일 크기(Byte): " + file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
