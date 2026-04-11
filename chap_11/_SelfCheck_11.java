package chap_11;

public class _SelfCheck_11 {
    public static void main(String[] args) {
        System.out.println("=== 적금 통장 테스트 ===");
        BankAccount savings = new SavingsAccount();
        savings.deposit(10000);  // 10,000원 입금
        savings.withdraw(5000);  // 5,000원 출금(성공)
        savings.withdraw(10000); // 10,000원 출금(실패 - 잔액 부족)
        System.out.println();    // 줄바꿈
        System.out.println("=== 마이너스 통장 테스트 ===");
        BankAccount minus = new MinusAccount();
        minus.deposit(10000);  // 10,000원 입금
        minus.withdraw(5000);  // 5,000원 출금(성공)
        minus.withdraw(10000); // 10,000원 출금(성공 - 잔액 음수 가능)
    }
}
abstract class BankAccount { // 기본 클래스
    int balance;
    void deposit(int amount) { // 공통 기능: 입금
        balance += amount;
        System.out.println(amount + "원 입금 완료(현재 잔액: " + balance + "원)");
    }
    abstract void withdraw(int amount); // 클래스마다 다른 기능: 출금(추상 메서드)
}

class SavingsAccount extends BankAccount { // 적금 통장 클래스
    @Override
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료(현재 잔액: " + balance + "원)");
        } else {
            System.out.println("잔액이 부족합니다.(현재 잔액: " + balance + "원)");
        }
    }
}

// 마이너스 통장 클래스
class MinusAccount extends BankAccount {
    @Override
    void withdraw(int amount) {
        balance -= amount;
        System.out.println(amount + "원 출금 완료(현재 잔액: " + balance + "원)");
    }
}

