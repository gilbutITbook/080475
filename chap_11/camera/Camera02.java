package chap_11.camera;

// 카메라의 기본 설계도
public abstract class Camera02 {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }
    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }
    // 이름만 있고 본문이 없는 주상 메서드, 자식 클래스에서 완성해야 함
    public abstract void showMainFeature();

}

