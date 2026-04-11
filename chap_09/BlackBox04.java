package chap_09;

public class BlackBox04 {
    String modelName;  // 모델명
    String resolution; // 해상도
    int price;         // 가격
    String color;      // 색상
    static boolean canAutoReport = false; // 자동 신고 기능(기본값: 지원 안 됨)
    // 자동 신고 기능을 수행하는 메서드
    void autoReport() {
        if (canAutoReport) { // 자동 신고 기능이 켜져 있다면(true)
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else { // 자동 신고 기능이 꺼져 있다면(false)
            System.out.println("자동 신고 기능을 지원하지 않습니다.");
        }
    }
    // 메모리 카드 삽입 메서드(용량을 전달받음)
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB입니다.");
    }

    // 영상 파일 개수를 반환하는 메서드
    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9; // 일반 영상의 개수 반환
        } else if (type == 2) {
            return 1; // 이벤트 영상의 개수 반환
        }
        return 10; // 그 외의 경우에는 전체 영상 개수 반환
    }


}
