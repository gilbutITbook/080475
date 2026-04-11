package chap_10;

import chap_10.camera.Camera01;
import chap_10.camera.FactoryCam01;
import chap_10.camera.SpeedCam01;

public class _01_Inheritance {
    public static void main(String[] args) {
        // 각 카메라 클래스의 객체 생성
        Camera01 camera = new Camera01();
        FactoryCam01 factoryCam = new FactoryCam01();
        SpeedCam01 speedCam = new SpeedCam01();
        // 각 카메라의 이름 출력
        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        // 부모에게 물려받은 공통 기능
        System.out.println("--- 부모로부터 물려받은 기능 테스트 ---");
        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();
        // 자식 클래스는 고유 기능
        System.out.println("--- 자식 클래스 고유 기능 테스트 ---");
        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }

}
