package appendix_02.converter;

@FunctionalInterface // 애너테이션을 붙여 함수형 인터페이스임을 컴파일러에 알림
public interface Convertible {
    void convert(int USD); // 달러를 입력받아 변환하는 추상 메서드
    // 추상 메서드를 하나 더 추가하면 컴파일 오류 발생
}
