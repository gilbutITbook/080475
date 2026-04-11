package chap_10;

import chap_10.camera.Camera03;
import chap_10.camera.FactoryCam03;
import chap_10.camera.SpeedCam03;

public class _03_Polymorphism {
    public static void main(String[] args) {
        // 부모 클래스 타입으로 객체 생성
        Camera03 camera = new Camera03();
        Camera03 factoryCam = new FactoryCam03(); // Camera03 객체에 FactoryCam03 객체를!
        Camera03 speedCam = new SpeedCam03(); // Camera03 객체에 SpeedCam03 객체를!

        camera.showMainFeature(); // Camera03의 메서드 호출
        factoryCam.showMainFeature(); // FactoryCam03에 오버라이딩된 메서드 호출
        speedCam.showMainFeature();// SpeedCam03에 오버라이딩된 메서드 호출

        // Camera 타입의 배열 하나로 모든 카메라 객체 관리
        System.out.println("--- 카메라 배열로 관리하기 ---");
        Camera03[] cameras = new Camera03[3];
        cameras[0] = new Camera03();
        cameras[1] = new FactoryCam03();
        cameras[2] = new SpeedCam03();
        for (Camera03 cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("--- 자식 클래스의 고유 기능 사용하기 ---");
        for (Camera03 cam : cameras) {
/*            // cam의 타입 확인
            if (cam instanceof FactoryCam03) {
                // cam을 FactoryCam03 타입으로 형 변환
                ((FactoryCam03) cam).detectFire();
            }
            // cam의 타입 확인
            else if (cam instanceof SpeedCam03) {
                // cam을 SpeedCam03 타입으로 형 변환
                ((SpeedCam03) cam).checkSpeed();
                ((SpeedCam03) cam).recognizeLicensePlate();
            }*/
            if (cam instanceof FactoryCam03 fCam) {
                // 별도의 형 변환 과정 없이 fCam 변수를 바로 사용
                fCam.detectFire();
            }
            else if (cam instanceof SpeedCam03 sCam) {
                // sCam 변수를 바로 사용
                sCam.checkSpeed();
                sCam.recognizeLicensePlate();
            }
        }
    }
}
