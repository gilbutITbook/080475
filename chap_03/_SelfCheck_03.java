package chap_03;

public class _SelfCheck_03 {
    public static void main(String[] args) {
        // 1. 초기 데이터 설정
        int price = 30000;
        int coupon = 5000;
        // 2. 최종 금액 계산
        int totalPrice = price - coupon;
        // 3. 무료 배송 조건 (2만원 이상 결제 시)
        boolean applyFreeShipping = (totalPrice >= 20000);
        // 4. 결과 출력
        System.out.println("최종 결제 금액: " + totalPrice + "원");
        System.out.println("무료 배송 적용 여부: " + applyFreeShipping);
    }
}
