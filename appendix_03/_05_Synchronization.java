package appendix_03;

import appendix_03.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room(); // 청소할 방을 관리하는 객체 생성
        Runnable cleaner1 = new Runnable() { // 직원1(스레드 1)의 할 일 정의
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) { // 5개 방 청소
                    room.clean("직원1");
                    try {
                        Thread.sleep(1000); // 1초 동안 대기
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (i == 2) { // 방 2개 청소 후 "못하겠다!"며 작업 중단
                        throw new RuntimeException("못하겠다!");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --"); // 이 줄은 실행되지 않음
            }
        };
        Runnable cleaner2 = () -> { // 직원2(스레드 2)의 할 일 정의
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) { // 5개 방 청소
                room.clean("직원2");
                try {
                    Thread.sleep(1000); // 1초 동안 대기
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
