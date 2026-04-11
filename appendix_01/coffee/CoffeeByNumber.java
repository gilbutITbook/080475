package appendix_01.coffee;

public class CoffeeByNumber {
    public int waitingNumber; // 대기 번호를 저장할 공간(정수만 가능)
    // 대기 번호를 전달받는 생성자
    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber; // 전달받은 번호 저장
    }
    // 커피 준비 완료 안내
    public void ready() {
        System.out.println("커피 준비 완료: " + waitingNumber);
    }

}
