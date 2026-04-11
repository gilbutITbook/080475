package appendix_03;

class ReadingTask implements Runnable { // 아빠의 할 일을 정의하는 클래스
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("아빠가 " + i + "페이지를 읽고 있습니다.");
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("아빠가 책을 다 읽었습니다!");
    }
}
class MathTask implements Runnable { // 딸의 할 일을 정의하는 클래스
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("딸이 " + i + "번 문제를 풀고 있습니다.");
            try {
                Thread.sleep(300); // 0.3초 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("딸이 수학 문제를 다 풀었습니다!");
    }
}
public class _Quiz_a3 { // 메인 클래스
    public static void main(String[] args) {
        Thread dadThread = new Thread(new ReadingTask());
        Thread daughterThread = new Thread(new MathTask());
        dadThread.start();
        daughterThread.start();
        try { // 두 사람의 할 일이 끝날 때까지 대기
            dadThread.join();
            daughterThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("아빠와 딸이 보드게임을 시작합니다!");
    }
}
