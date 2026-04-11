package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 주어진 조건 변수들(값을 바꿔서 테스트해 보세요.)
        // 회덮밥 정식 25,000원/불고기 피자(L) 32,000원/모듬회(대) 99,000원
        String menu = "회덮밥 정식";
        int foodPrice = 25000;       // 음식 가격
        boolean isRaining = false;    // 비가 오는지 여부
        boolean hasVIPCoupon = false; // VIP 쿠폰 소지 여부
        // 1. 기본 배달비 설정
        int deliveryFee = 3000;
        // 2. 우천 할증 계산
        if (isRaining) {
            deliveryFee += 1000;
        }
        // 3. 주문 금액에 따른 배달비 무료 적용
        if (foodPrice > 70000) {
            deliveryFee = 0;
        }
        // 4. VIP 쿠폰 할인 적용(가장 마지막 확인)
        if (hasVIPCoupon) {
            deliveryFee = 0;
        }
        // 최종 결제 금액 계산
        int totalPrice = foodPrice + deliveryFee;
        // 결과 출력
        System.out.println("주문 메뉴: " + menu);
        System.out.println("주문 금액: " + foodPrice + "원");
        System.out.println("배달비: " + deliveryFee + "원");
        System.out.println("최종 결제 금액: " + totalPrice + "원");
    }


}
