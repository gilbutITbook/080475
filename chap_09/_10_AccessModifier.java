package chap_09;

public class _10_AccessModifier {
    public static void main(String[] args) {
/*
        BlackBoxRefurbish01 b1 = new BlackBoxRefurbish01();
        b1.modelName = "까망이";
        // setPrice()을 사용해 올바르게 가격 설정
        b1.setPrice(200000);
        System.out.println("세터로 설정한 후 가격: " + b1.getPrice() + "원");
        // 변수에 직접 접근해 잘못된 값을 넣음
        System.out.println("--- 할인 행사... 가 아니라 실수! ---");
        b1.price = -5000;
        System.out.println("직접 변경한 후 가격: " + b1.getPrice() + "원");
*/

        BlackBoxRefurbish02 b2 = new BlackBoxRefurbish02();
        System.out.println("세터로 설정한 후 가격: " + b2.getPrice() + "원");
        System.out.println("--- 할인 행사...");
        //b2.price = -5000; // 오류 발생
        b2.setPrice(-5000);
        System.out.println("세터로 잘못된 값을 설정한 후 가격: " + b2.getPrice() + "원");

    }

}
