package chap_11;

import chap_11.camera.*;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스로 객체를 만들려고 시도
        //Camera01 camera = new Camera01();  // 컴파일 오류

        // 추상 클래스를 상속해 완성된 자식 클래스는 객체 생성 가능
        FactoryCam01 factoryCam = new FactoryCam01();
        factoryCam.showMainFeature();
        SpeedCam01 speedCam = new SpeedCam01();
        speedCam.showMainFeature();

    }

}
