package chap_10.camera;

// 과속 단속 카메라 클래스
// SpeedCam01은 Camera01을 상속받음
public class SpeedCam01 extends Camera01 {
    //public String name;
    public SpeedCam01() {
        this.name = "과속 단속 카메라";
    }
/*    public void takePicture() {
        // 사진을 촬영합니다.
    }
    public void recordVideo() {
        // 동영상을 녹화합니다.
    }*/
    public void checkSpeed() {
        // 속도를 측정합니다.
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        // 차량 번호를 인식합니다.
        System.out.println("차량 번호를 인식합니다.");
    }

}
