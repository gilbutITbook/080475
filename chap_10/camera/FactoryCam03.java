package chap_10.camera;

public class FactoryCam03 extends Camera03 {
    public FactoryCam03() {
        this.name = "공장 카메라";
    }
    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
    // 부모의 showMainFeature 메서드 재정의
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 화재 감지");
    }

}
