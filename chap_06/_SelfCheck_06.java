package chap_06;

public class _SelfCheck_06 {
    public static void main(String[] args) {
        // 1. 현재 잔량 설정
        int currentLevel = 72;

        // 2. 충전 시작 안내문 출력
        System.out.println("충전을 시작합니다.");

        // 3. 현재 잔량부터 100% 까지 반복 수행
        for (int i = currentLevel; i <= 100; i++) {
            System.out.println("현재 충전량: " + i + "%");

            // 특정 구간(20, 50, 80) 체크
            if (i == 20 || i == 50 || i == 80) {
                System.out.println("충전 중입니다.");
            }
        }

        // 4. 100% 도달 시 출력
        System.out.println("충전이 완료되었습니다. 케이블을 분리해 주세요.");
    }

}
