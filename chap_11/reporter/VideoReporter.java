package chap_11.reporter;

public class VideoReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("화재 직전 30초 동영상을 첨부해 신고합니다.");
    }
}
