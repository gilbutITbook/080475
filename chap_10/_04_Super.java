package chap_10;

import chap_10.camera.FactoryCam04;
import chap_10.camera.SpeedCam04;

public class _04_Super {
    public static void main(String[] args) {
        FactoryCam04 factoryCam = new FactoryCam04();
        SpeedCam04 speedCam = new SpeedCam04();
        factoryCam.recordVideo();
        System.out.println("-----------------");
        speedCam.takePicture();
    }
}
