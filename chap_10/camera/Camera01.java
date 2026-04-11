package chap_10.camera;

// 기본 카메라 클래스
// 부모 클래스
public class Camera01 {
    public String name;
    public Camera01() {
        this.name = "카메라";
    }
    public void takePicture() {
        // 사진을 활영합니다.
        // 이 부분만 수정하면 모든 자식 클래스에 적용
        System.out.println(this.name + ": 사진을 촬영합니다.");
    }
    public void recordVideo() {
        // 동영상을 녹화합니다.
        System.out.println(this.name + ": 동영상을 녹화합니다.");
    }
}
