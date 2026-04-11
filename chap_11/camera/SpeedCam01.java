package chap_11.camera;

public class SpeedCam01 extends Camera01 {
    // showMainFeature()를 과속 단속 카메라에 맞게 구현
    @Override
    public void showMainFeature() {
        System.out.println("속도를 측정하고, 번호를 인식합니다.");
    }

}
