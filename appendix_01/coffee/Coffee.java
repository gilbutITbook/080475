package appendix_01.coffee;

// 클래스 이름 뒤에 <T>를 붙여 제네릭 클래스임을 선언
public class Coffee<T> {
    public T name; // 아직 타입이 정해지지 않은 변수
    public Coffee(T name) { // 생성자에서도 T 사용
        this.name = name;
    }
    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }

}
