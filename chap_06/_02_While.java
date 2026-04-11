package chap_06;

public class _02_While {
    public static void main(String[] args) {
        int distance = 25; // 레인 끝까지의 전체 거리(25m)
        int move = 0;     // 현재까지 이동한 거리
        // 현재 이동 거리가 전체 거리보다 작은 동안 반복
        while (move < distance) {
            System.out.println("발차기를 합니다.");
            System.out.println("현재 이동 거리: " + move + "m");
            // move += 3; // 한 번 발차기에 3m씩 이동한다고 가정
        }
        System.out.println("도착했습니다.");

    }
}
