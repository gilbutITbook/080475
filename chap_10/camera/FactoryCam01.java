package chap_10.camera;

// 공장 카메라 클래스
// FactoryCam01은 Camera01을 상속받음
public class FactoryCam01 extends Camera01 {
    //public String name;
    public FactoryCam01() {
        this.name = "공장 카메라";
    }
/*    public void takePicture() {
        // 사진을 촬영합니다.
    }
    public void recordVideo() {
        // 동영상을 녹화합니다.
    }*/
    public void detectFire() {
        // 화재를 감지합니다.
        System.out.println("화재를 감지합니다.");
    }

}
