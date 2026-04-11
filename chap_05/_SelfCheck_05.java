package chap_05;

public class _SelfCheck_05 {
    public static void main(String[] args) {
        int age = 21; // 1. 나이
        boolean isLocalResident = true; // 2. 지역 주민 여부
        // 3. 나이에 따른 기본 요금 산정
        int fee = 0;
        if (age < 13) {
            fee = 10000;
        } else if (age < 19) {
            fee = 20000;
        } else {
            fee = 30000;
        }
        // 4. 지역 주민 할인 적용
        if (isLocalResident) {
            System.out.println("지역 주민 할인이 적용되었습니다.");
            fee = (int) (fee * 0.5);
        }
        // 5. 결과 출력
        System.out.println("최종 결제 금액은 " + fee + "원입니다.");
    }

}
