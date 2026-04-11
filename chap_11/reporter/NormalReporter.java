package chap_11.reporter;

public class NormalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재를 신고합니다.");
    }
}
