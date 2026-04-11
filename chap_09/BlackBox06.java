package chap_09;

public class BlackBox06 {
    String modelName; // 인스턴스 변수
    static boolean canAutoReport = false; // 클래스 변수

    // static 키워드가 붙은 클래스 메서드
    static void callServiceCenter() {
        // 인스턴스 변수에 접근 시도 -> 오류 발생
        //modelName = "test";
        // 클래스 변수에 접근 -> 문제 없음
        canAutoReport = false;
        System.out.println("고객센터(1588-xxxx)로 연결합니다.");
    }

}
