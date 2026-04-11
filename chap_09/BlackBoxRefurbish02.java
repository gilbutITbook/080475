package chap_09;

public class BlackBoxRefurbish02 {
/*
    private String modelName;    // 모델명
    private String resolution;   // 해상도
    private int price;           // 가격
    private String color;        // 색상
*/

    public String modelName; // 모델명(어디서든 접근 가능)
    String resolution;       // 해상도(같은 패키지에서만 접근 가능)
    private int price;       // 가격(이 클래스 내부에서만 접근 가능)
    protected String color;  // 색상(같은 패키지 또는 자식 클래스에서 접근 가능)

    // 게터와 세터는 이전과 동일
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

    // private으로 변경
/*    private int getPrice() {
        return price;
    }*/


}

// 접근 제어자를 지정하지 않은 default 클래스
class A {
    // 비어 있는 클래스
}
