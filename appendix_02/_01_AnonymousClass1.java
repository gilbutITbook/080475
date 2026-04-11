package appendix_02;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 첫 번째 손님: 아메리카노 주문
        Coffee c1 = new Coffee(); // Coffee 클래스로 c1 객체 생성
        c1.order("아메리카노");
        System.out.println("----------------");
        // 두 번째 손님: 라떼 주문
        Coffee c2 = new Coffee(); // Coffee 클래스로 c2 객체 생성
        c2.order("라떼");
        System.out.println("----------------");

        Coffee specialCoffee = new Coffee() { // 특별한 손님(친구)
            @Override
            public void order(String coffee) {
                super.order(coffee); // 기존 Coffee의 order() 기능 실행
                System.out.println("(귓속말)딸기 케이크는 서비스야."); // 기능 추가
            }
            @Override
            public void returnTray() { // 쟁반 반납 기능 맞춤 설정
                System.out.println("(귓속말)자리에 두면 내가 치울게.");
            }
        }; // 익명 클래스는 세미콜론(;) 마무리
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}
// 설계도
class Coffee {
    public void order(String coffee) { // 주문 기능
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }
    public void returnTray() { // 반납 기능
        System.out.println("커피잔과 쟁반을 반납했습니다.");
    }
}

