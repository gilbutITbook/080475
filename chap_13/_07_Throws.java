package chap_13;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        System.out.println("메인 메서드: writeFile()을 호출합니다.");
        //writeFile();

        try {
            writeFile(); // 호출하는 곳에서 예외 처리
        } catch (IOException e) {
            System.out.println("메인 메서드: 문제를 전달받아 직접 해결할게요!");
            System.out.println("오류 메시지: " + e.getMessage());
        }

        System.out.println("메인 메서드: 프로그램이 정상적으로 종료되었습니다.");
    }

/*    public static void writeFile() { // 파일에 글 쓰는 기능을 가진 메서드
        try {
            FileWriter writer = new FileWriter("test.txt");
            throw new IOException("파일 쓰기에 실패했어요!"); // 예외 발생시키기
        } catch (IOException e) {
            System.out.println("writeFile 메서드: 직접 문제를 해결했어요!");
            System.out.println("오류 메시지: " + e.getMessage());
        }
    }*/
    // IOException이 발생할 수 있다고 알려주는 메서드
    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!");
    }
}
