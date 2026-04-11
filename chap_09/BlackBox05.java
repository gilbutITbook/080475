package chap_09;

public class BlackBox05 {
    String modelName;  // 모델명
    // showDateTime: 날짜/시간 표시 여부
    // showSpeed: 속도 표시여부
    // min: 영상 저장 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) { // showDateTime 값이 true이면
            System.out.println("영상에 날짜와 시간을 표시합니다.");
        }
        if (showSpeed) { // showSpeed 값이 true이면
            System.out.println("영상에 속도를 표시합니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 녹화합니다.");
    }
    //  자주 사용하는 설정으로 녹화하는 메서드
    void record() {
        // 기존에 만든 record 메서드를 호출
        record(true, true, 5);
    }
}
