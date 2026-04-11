package chap_09;

public class BlackBox09 {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    // 세터(Setter): 가격
    void setPrice(int price) {
        if (price < 100000) { // 10만 원보다 작은 값이 들어오면
            this.price = 100000; // 최소 금액인 10만원으로 설정
        } else {
            this.price = price; // 아니라면 전달받은 값 그대로 설정
        }
    }
    // 게터(Getter): 가격
    int getPrice() {
        return price;
    }

    // 세터(Setter): 해상도
    void setResolution(String resolution) {
        this.resolution = resolution;
    }
    // 게터(Getter): 해상도
    String getResolution() {
        if (resolution == null || resolution.isEmpty()) { // 값이 비어 있다면
            return "판매자에게 문의하세요."; // 정해진 안내 문구 반환
        }
        return resolution;
    }

    // modelName과 color에 대한 게터와 세터
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }


}
