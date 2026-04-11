package chap_13;

// '금액 부족'이라는 우리만의 규칙을 정의하는 사용자 정의 예외 클래스
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
// 자판기 기능을 가진 클래스
class VendingMachine {
    // 이 메서드는 금액이 부족하면 InsufficientFundsException을 발생시킬 수 있음
    public void purchase(String item, int price, int moneyInserted)
            throws InsufficientFundsException {
        System.out.println("--- 구매 시도 ---");
        System.out.println("상품: " + item + " / 가격: " + price +
                "원 / 투입 금액: " +  moneyInserted + "원");
        // 투입 금액이 가격보다 적다는 '우리가 정한 규칙'을 어겼을 때 예외를 직접 발생시킴
        if (moneyInserted < price) {
            throw new InsufficientFundsException("금액이 부족합니다.");
        }
        // 규칙을 통과하면 정상적으로 구매 처리
        int change = moneyInserted - price;
        System.out.println("[성공] " + item + " 구매 완료! 거스름돈은 "
                + change + "원 입니다.");
    }
}


public class _Quiz_13 {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        try {
            // --- 테스트 1: 정상적인 경우 (금액 충분) ---
            // 예외 발생 가능성이 있는 코드를 try 블록에 넣음
            machine.purchase("콜라", 1200, 2000);
        } catch (InsufficientFundsException e) {
            // try 블록에서 InsufficientFundsException이 발생하면 여기가 실행됨
            System.out.println("[오류] " + e.getMessage());
        }
        try {
            // --- 테스트 2: 예외가 발생하는 경우 (금액 부족) ---
            machine.purchase("사이다", 1500, 1000);
        } catch (InsufficientFundsException e) {
            System.out.println("[오류] " + e.getMessage());
        }
    }

}
