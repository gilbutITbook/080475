package chap_10.camera;

public class SpeedCam04 extends Camera04 {
    public SpeedCam04() {
        //this.name = "과속 단속 카메라";
        super("과속 단속 카메라"); // 부모 클래스의 생성자 호출
    }
    @Override
    public void takePicture() {
        super.takePicture(); // 부모 클래스의 takePicture()를 먼저 호출
        checkSpeed();        // 다음으로 자식 클래스의 추가 기능 실행
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도를 측정합니다.
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        // 차량 번호를 인식합니다.
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }
}
