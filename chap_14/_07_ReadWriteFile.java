package chap_14;

import java.io.*;

public class _07_ReadWriteFile {
    public static void main(String[] args) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("goodjob.txt"))) {
            bw.write("1. 이제 거의 끝이 보여요."); // 텍스트 쓰기 메서드
            bw.newLine(); // 줄 바꿈
            bw.write("2. 여기까지 오신 여러분 정말 대단해요!");
            bw.newLine();
        } catch (IOException e) { // 파일 쓰기 예외 처리
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            bw.write("3. 조금만 더 힘내요!");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br =
                     new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
