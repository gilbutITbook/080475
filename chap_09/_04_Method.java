package chap_09;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox04 b1 = new BlackBox04();
        b1.modelName = "까망이";
        b1.autoReport(); // 자동 신고 기능 미지원
        BlackBox04.canAutoReport = true;
        b1.autoReport(); // 자동 신고 기능 지원

        // 메모리 카드 삽입 메서드 호출(256 전달)
        b1.insertMemoryCard(256);

        // 일반 영상(1) 개수 확인
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수: " + fileCount + "개");
        // 이벤트 영상(2) 개수 확인하기
        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수: " + fileCount + "개");


    }

}
