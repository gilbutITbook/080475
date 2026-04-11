package chap_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _SelfCheck_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이름 입력 받기
        System.out.print("수료자 이름을 입력하세요: ");
        String name = sc.nextLine();

        // 오늘 날짜 가져오기 및 포맷 지정
        LocalDate today = LocalDate.now(); // 오늘 날짜 정보
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
        String formattedDate = today.format(formatter); // 지정한 형식으로 변환

        // 수료증 출력
        System.out.println();
        System.out.println("========================================");
        System.out.println("              [ 수 료 증 ]               ");
        System.out.println("========================================");
        System.out.println("  성명: " + name);
        System.out.println("  과정명: 나도코딩 자바 기본편");
        System.out.println();
        System.out.println("  내용: 위 사람은 자바의 핵심 기초 과정을");
        System.out.println("       성실히 이수하였기에 이 수료증을");
        System.out.println("       수여합니다.");
        System.out.println();
        System.out.println("            " + formattedDate); // 오늘 날짜
        System.out.println("            나도코딩 드림               ");
        System.out.println("========================================");
    }

}
