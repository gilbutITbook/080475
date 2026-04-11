package chap_09;

public class _06_ClassMethod {
    public static void main(String[] args) {
/*        // 1번 블랙박스 객체 생성
        BlackBox06 b1 = new BlackBox06();
        b1.callServiceCenter(); // 1번 블랙박스의 고객센터 전화
        // 2번 블랙박스 객체 생성
        BlackBox06 b2 = new BlackBox06();
        b2.callServiceCenter(); // 2번 블랙박스의 고객센터 전화*/

        // 객체 생성 없이 클래스 이름만으로 메서드 호출
        BlackBox06.callServiceCenter();

        // String 클래스의 클래스 메서드 valueOf() 사용 예시
        String s = String.valueOf(3); // 정수 3을 문자열 "3"으로 변환
        System.out.println(s);


    }

}
