package chap_09;

public class BlackBox03 {
    // 인스턴스 변수: 객체마다 서로 다른 값
    String modelName;  // 모델명
    String resolution; // 해상도
    int price;         // 가격
    String color;      // 색상

    // 클래스 변수: 모든 객체가 값을 공유
    static boolean canAutoReport = false; // 자동 신고 기능(초깃값: 기능 꺼짐)

}
