package chap_10;

import chap_10.camera.Camera02;
import chap_10.camera.FactoryCam02;
import chap_10.camera.SpeedCam02;

public class _02_MethodOverriding {
    public static void main(String[] args) {
        // 각 카메라 객체 생성
        Camera02 camera = new Camera02();
        FactoryCam02 factoryCam = new FactoryCam02();
        SpeedCam02 speedCam = new SpeedCam02();
        // 각 객체의 주요 기능 소개 메서드 호출
        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }

}
