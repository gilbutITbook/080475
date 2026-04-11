package chap_14;

import java.io.BufferedReader; // 줄 단위로 텍스트를 읽기 위한 클래스
import java.io.FileReader;     // 파일에서 문자 스트림을 읽기 위한 클래스
import java.io.IOException;    // 입출력 예외 처리를 위한 클래스

public class _Quiz_14 {
    public static void main(String[] args) {
        String fileName = "vacation.txt";
        System.out.println("수상한 여행 편지에서 암호 해독을 시작합니다");
        System.out.println("------------------------------------");
        // try-with-resources: 파일 사용 후 자동으로 close() 처리
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line; // 읽어온 한 줄을 저장할 변수
            // 파일 끝(null)에 도달할 때까지 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                // 각 줄의 첫 번째 글자만 추출
                String firstLetter = line.substring(0, 1);
                // 줄바꿈 없이 이어서 출력
                System.out.print(firstLetter);
            }
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("암호 해독 완료! 축하합니다!");
        } catch (IOException e) { // 파일이 없거나 읽기 권한이 없을 때 예외 처리
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
