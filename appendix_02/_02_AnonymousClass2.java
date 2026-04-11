package appendix_02;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger(); // 엄마표 버거 객체 생성
        momMadeBurger.cook(); // cook 메서드 호출
        System.out.println("----------------------------");
        HomeMadeBurger broMadeBurger = getBroMadeBurger(); // 동생표 버거 객체 생성
        broMadeBurger.cook();
    }
    public static HomeMadeBurger getMomMadeBurger() { // 엄마표 버거 반환 메서드
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료: 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
    public  static HomeMadeBurger getBroMadeBurger() { // 동생표 버거 반환 메서드
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 수제 버거");
                System.out.println("재료: 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }
}
abstract class HomeMadeBurger { // 수제 버거의 추상 클래스
    public abstract void cook();
}
