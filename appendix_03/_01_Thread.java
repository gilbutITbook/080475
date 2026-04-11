package appendix_03;

import appendix_03.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //cleanBySelf(); // 혼자 청소 작업을 실행

        CleanThread cleanThread = new CleanThread(); // 직원 스레드 생성
        //cleanThread.run(); // 직원에게 청소 지시(run() 직접 호출)
        cleanThread.start(); // start() 호출로 변경
        cleanByBoss(); // 사장님도 청소 시작
    }
    public static void cleanByBoss() { // 사장님 홀수 방 청소 메서드
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }

/*    // 1번부터 10번 방까지 순서대로 혼자 청소
    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }*/
}
