package chap_10.camera;

public class FactoryCam04 extends Camera04 {
    public FactoryCam04() {
        //this.name = "공장 카메라";
        super("공장 카메라"); // 부모 클래스의 생성자 호출
    }
    // 메서드 오버라이딩
    @Override
    public void recordVideo() {
        super.recordVideo(); // 부모 클래스의 recordVideo()를 먼저 실행
        detectFire(); // 다음으로 자식 클래스의 추가 기능 실행
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
    // 부모의 showMainFeature 메서드 재정의
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 화재 감지");
    }

}
