package chap_09;

public class BlackBox08 {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호 발급용

    // 기본 생성자
    BlackBox08() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter; // 객체가 만들어질 때마다 counter 값을 1 증가시켜 시리얼 번호로 부여
        System.out.println("새로운 시리얼 번호를 발급했습니다. → " + this.serialNumber);
    }

    // 사용자 정의 생성자
    BlackBox08(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

/*    // 잘못된 예시
    BlackBox08(String modelName, String resolution, int price, String color) {
        System.out.println("이 코드는 this()보다 먼저 올 수 없어요!");
        this(); // 오류 발생
    }*/


}
