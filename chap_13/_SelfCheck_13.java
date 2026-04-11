package chap_13;

public class _SelfCheck_13 {
    public static void main(String[] args) {
        int totalAmount = 30000; // 총 결제 금액
        int people = 0; // 총 인원 수
        try {
            int amountPerPerson = totalAmount / people; // 여기서 0이면 예외 발생
            System.out.println("총 결제 금액 " + totalAmount
                    + "원에서 1인당 지불 금액은 " + amountPerPerson + "원입니다.");
        } catch (ArithmeticException e) {
            System.out.println("오류: 0명으로는 나눌 수 없습니다.");
        } finally {
            System.out.println("정산 프로그램을 종료합니다.");
        }
    }
}
