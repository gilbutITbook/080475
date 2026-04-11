package appendix_03;

import appendix_03.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start(); // 직원 청소 시작
        try {
            //thread.join(); // 직원 청소가 끝날 때까지 기다림
            thread.join(2500); // 최대 2.5초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss(); // (직원 청소가 끝난 뒤에) 사장님 청소 시작
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000); // 1초 동안 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");

    }
}

