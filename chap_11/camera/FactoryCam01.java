package chap_11.camera;

public class FactoryCam01 extends Camera01 {
    // 부모 클래스의 추상 메서드 showMainFeature()를 완성시키는 부분
    @Override
    public void showMainFeature() {
        System.out.println("화재를 감지합니다.");
    }

}
