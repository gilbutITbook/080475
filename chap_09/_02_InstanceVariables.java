package chap_09;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        // 첫 번째 블랙박스 객체 생성
        BlackBox02 b1 = new BlackBox02();
        // b1 객체의 인스턴스 변수에 값 할당
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        // b1 객체의 인스턴스 변수 값 출력
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("-------------------");
        // 두 번째 블랙박스 객체 생성
        BlackBox02 b2 = new BlackBox02();
        // b2 객체의 인스턴스 변수에 값 할당
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";
        // b2 객체의 인스턴스 변수 값 출력
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);

    }

}
