package appendix_03;

import appendix_03.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable(); // 작업에 대한 객체 생성
        Thread thread = new Thread(cleanRunnable); // Thread 객체에 작업 전달
        thread.start(); // 스레드 실행
        cleanByBoss(); // 사장님도 동시에 청소 시작
    }
    public static void cleanByBoss() { // 사장님이 청소하는 코드
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}

