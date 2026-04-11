package chap_08;

public class _SelfCheck_08 {
    public static void main(String[] args) {
        // 1. 전월 실적 설정
        int myPerformance = 450000;
        // 2. 메서드 호출
        int discount = getDiscount(myPerformance);
        // 3. 결과 출력
        System.out.println("전월 실적: " + myPerformance + "원");
        System.out.println("이번 달 할인 혜택: " + discount + "원");
    }
    // 최종 할인 금액 계산
    public static int getDiscount(int performance) {
        if (performance >= 600000) {
            return 20000; // 실적구간 2
        } else if (performance >= 300000) {
            return 10000; // 실적구간 1
        } else {
            return 0;      // 실적 미달
        }
    }
}
