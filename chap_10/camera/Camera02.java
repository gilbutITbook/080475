package chap_10.camera;

public class Camera02 {
    public String name;
    public Camera02() {
        this.name = "카메라";
    }
    public void takePicture() {
        System.out.println(this.name + ": 사진을 촬영합니다.");
    }
    public void recordVideo() {
        System.out.println(this.name + ": 동영상을 녹화합니다.");
    }
    // 주요 기능을 소개하는 메서드
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 사진 촬영, 동영상 녹화");
    }

}
