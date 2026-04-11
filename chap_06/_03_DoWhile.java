package chap_06;

public class _03_DoWhile {
    public static void main(String[] args) {
        int distance = 25; // 레인 끝까지의 전체 거리(25m)
        int move = 0; // 현재 이동 거리
        //int height = 2; // 키 2m
        int height = 25; // 키 25m
/*
        System.out.println("--- 거인 선수 입장 ---");
        // 현재 이동 거리 + 키가 전체 거리보다 작은 동안 반복
        while (move + height < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move + "m");
            move += 3; // 한 번 발차기에 3m씩 이동
        }*/

        System.out.println("--- 거인 선수, 이번에는 do-while로 도전! ---");
        do {
            System.out.println("발차기를 합니다.");
            System.out.println("현재 이동 거리: " + move + "m");
            move += 3;
        } while (move + height < distance); // 실행 후 조건 검사


        System.out.println("도착했습니다.");
    }
}
