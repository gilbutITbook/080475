package appendix_03;

public class _SelfCheck_a3 {
    public static void main(String[] args) {
        // 스레드 객체 생성
        Chef chef1 = new Chef("라면");
        Chef chef2 = new Chef("김밥");
        // 동시에 시작
        chef1.start();
        chef2.start();
    }
}

class Chef extends Thread { // Thread를 상속받는 Chef 클래스
    String dish;
    public Chef(String dish) {
        this.dish = dish;
    }
    @Override
    public void run() { // 스레드가 실행할 작업 정의
        try {
            System.out.println("--- " + dish + " 요리 시작 ---");
            Thread.sleep(1000); // 1초간 요리 중
            System.out.println("--- " + dish + " 요리 완료! ---");
        } catch (InterruptedException e) {
            System.out.println(dish + " 요리 중 문제가 발생했습니다.");
        }
    }
}
