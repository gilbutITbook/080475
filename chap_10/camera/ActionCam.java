package chap_10.camera;

public class ActionCam extends Camera04 {

    public final String lens; // 렌즈 종류를 저장할 변수
    public ActionCam() {
        super("액션 카메라"); // 부모 클래스의 생성자 호출
        this.lens = "광각 렌즈"; // 렌즈를 광각 렌즈로 설정
    }
    public final void makeVideo() {
        System.out.println(this.name + ": " + this.lens + "로 촬영한 영상을 사용해 멋진 비디오를 제작합니다.");
    }
}
