package chap_09;

public class _08_Constructor {
    public static void main(String[] args) {
        // 기본 생성자를 이용한 객체 생성
        BlackBox08 b1 = new BlackBox08();
        b1.modelName = "까망이";
        System.out.println(b1.modelName + "의 시리얼 번호: " + b1.serialNumber);
        System.out.println("-----------------------");
        // 사용자 정의 생성자를 이용한 객체 생성
        BlackBox08 b2 = new BlackBox08("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelName + "의 시리얼 번호: " + b2.serialNumber);

    }

}
