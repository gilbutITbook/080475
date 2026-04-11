package chap_11.camera;

import chap_11.detector.*;
import chap_11.reporter.*;

public class FactoryCam02 extends Camera02 implements Detectable, Reportable {
    // 부모 클래스의 추상 메서드 showMainFeature()를 완성시키는 부분

   // 기능 부품을 장착할 수 있는 공간
    private Detectable detector;
    private Reportable reporter;
    // 외부에서 부품(객체)을 전달받아 장착하는 메서드(세터)
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }
    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재를 감지합니다.");
    }
    @Override
    public void detect() {
        detector.detect(); // 실제 감지 기능은 장착된 부품에 맡김
    }
    @Override
    public void report() {
        //System.out.println("화재를 신고합니다.");
        reporter.report(); // 실제 신고 기능도 장착된 부품에 맡김
    }


}
