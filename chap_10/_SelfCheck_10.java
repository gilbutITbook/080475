package chap_10;

public class _SelfCheck_10 {
    public static void main(String[] args) {
        Payment payment1 = new CardPayment();    // 카드 결제
        Payment payment2 = new CashPayment();    // 현금 결제
        Payment payment3 = new NadoPayPayment(); // 나도페이 결제
        payment1.pay(10000);
        payment2.pay(5000);
        payment3.pay(7000);
    }
}
class Payment {
    public void pay(int amount) {
        System.out.println(amount + "원을 결제했습니다.");
    }
}

// 카드 결제
class CardPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원을 결제했습니다.");
    }
}

// 현금 결제
class CashPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("현금으로 " + amount + "원을 결제했습니다.");
    }
}

// 나도페이 결제
class NadoPayPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("나도페이로 " + amount + "원을 결제했습니다.");
    }
}

