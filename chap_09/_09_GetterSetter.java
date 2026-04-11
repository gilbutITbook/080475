package chap_09;

public class _09_GetterSetter {
    public static void main(String[] args) {
/*        BlackBox09 b1 = new BlackBox09();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        // 문제 상황 1: 가격을 음수로 잘못 설정
        b1.price = -5000;
        System.out.println("가격: " + b1.price + "원");
        // 문제 상황 2: 설정되지 않은 값을 그대로 출력
        System.out.println("해상도: " + b1.resolution);*/

        BlackBox09 b2 = new BlackBox09();
        // 세터를 사용해 안전하게 값 설정, 해상도는 설정하지 않음
        b2.setModelName("하양이");
        b2.setPrice(-5000); // 실수로 음수 입력.
        b2.setColor("화이트");

        // 게터를 사용해 안전하게 값 조회
        System.out.println("모델명: " + b2.getModelName());
        System.out.println("가격: " + b2.getPrice() + "원");
        System.out.println("색상: " + b2.getColor());
        System.out.println("해상도: " + b2.getResolution());
    }

}
