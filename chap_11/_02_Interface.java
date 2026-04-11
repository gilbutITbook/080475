package chap_11;

import chap_11.camera.*;
import chap_11.reporter.*;
import chap_11.detector.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 신고 기능을 수행하는 객체 생성
        Reportable normalReporter = new NormalReporter();
        normalReporter.report(); // NormalReporter의 report() 호출
        Reportable videoReporter = new VideoReporter();
        videoReporter.report(); // VideoReporter의 report() 호출

        // 화재 감지 기능을 수행하는 객체 생성
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();


        FactoryCam02 factoryCam = new FactoryCam02();
        // 1. 일반 화재 감지기 + 일반 신고기 장착
        System.out.println("## 일반 부품 장착 ##");
        factoryCam.setDetector(fireDetector);   // 일반 화재 감지기 부품
        factoryCam.setReporter(normalReporter); // 일반 신고기 부품
        factoryCam.detect();                    // FireDetector가 동작
        factoryCam.report();                    // NormalReporter가 동작
        // 2. 향상된 화재 감지기 + 동영상 신고기로 교체
        System.out.println("## 고급 부품으로 교체 장착 ##");
        factoryCam.setDetector(advancedFireDetector); // 향상된 화재 감지기 부품
        factoryCam.setReporter(videoReporter);        // 동영상 신고기 부품
        factoryCam.detect();                          // AdvancedFireDetector가 동작
        factoryCam.report();                          // VideoReporter가 동작
    }
}
