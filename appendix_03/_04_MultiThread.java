package appendix_03;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable cleaner1 = new Runnable() { // 직원1의 청소 작업
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1) " + i + "번방 청소 중");
                    try {
                        Thread.sleep(1000); // 1초 동안 대기
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };
        Runnable cleaner2 = () -> { // 직원2의 청소 작업
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("(직원2) " + i + "번방 청소 중");
                try {
                    Thread.sleep(1000); // 1초 동안 대기
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };
        // 스레드(직원)를 생성하고 할 일을 전달
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        // 두 스레드(직원)에 동시에 일을 지시
        cleanerThread1.start();
        cleanerThread2.start();
    }
}

