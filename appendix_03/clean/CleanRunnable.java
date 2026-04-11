package appendix_03.clean;

public class CleanRunnable implements Runnable { // Runnable 인터페이스 구현
    @Override
    public void run() { // run()을 구현해야 함
        System.out.println("-- 직원 청소 시작(Runnable) --");
        for (int i = 2; i <= 10; i += 2) { // 짝수 방만 청소
            System.out.println("(직원) " + i + "번방 청소 중(Runnable)");
            try {
                Thread.sleep(1000); // 1초 동안 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝(Runnable) --");
    }
}
