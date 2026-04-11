package chap_09;

public class BlackBoxRefurbish01 {
    String modelName;  // 모델명
    String resolution; // 해상도
    int price;         // 가격
    String color;      // 색상
    // setPrice()에는 가격이 10만 원 미만이면 10만 원으로 설정하는 코드가 들어 있음
    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }
    public int getPrice() {
        return price;
    }

}
