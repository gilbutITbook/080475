package chap_09;

public class BlackBox07 {
    String modelName;  // 모델명
    String resolution; // 해상도
    int price;         // 가격
    String color;      // 색상
    // 모델명에 문자열을 덧붙이는 메서드
    void appendModelName(String modelName) {
        //modelName = modelName + modelName;
        this.modelName = this.modelName + modelName;
    }

}
