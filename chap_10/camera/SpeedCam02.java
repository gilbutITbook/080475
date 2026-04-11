package chap_10.camera;

public class SpeedCam02 extends Camera02 {
    public SpeedCam02() {
        this.name = "과속 단속 카메라";
    }
    public void checkSpeed() {
        // 속도를 측정합니다.
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        // 차량 번호를 인식합니다.
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override // 부모 클래스의 메서드를 재정의했다는 의미
    public void showMainFeature() { // 부모의 showMainFeature 메서드 재정의
        System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }
    /*  // 실수로 다음과 같이 작성하면
    @Override
    public void showMainFeatur() { // 이름에 e가 빠진 실수
        // 컴파일 오류 발생
    }*/


}
