package chap_10.camera;

// ActionCam의 기능 상속
public class SlowActionCam extends ActionCam {
    public SlowActionCam() {
        this.name = "슬로 액션 카메라";
    }
    // ActionCam의 makeVideo() 기능을 자식 클래스에서 변경
/*    public void makeVideo() {
        System.out.println(this.name + ": " + this.lens
                + "로 촬영한 영상을 사용해 멋진 슬로우 모드 비디오를 제작합니다.");
    }*/
}
