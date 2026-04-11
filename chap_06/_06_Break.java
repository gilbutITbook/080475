package chap_06;

public class _06_Break {
    public static void main(String[] args) {
        int max = 20; // 하루에 판매할 수 있는 치킨 수
        for (int i = 1; i <= 50; i++) { // 1번부터 50번 손님까지 반복
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            // 20마리 치킨이 모두 팔리면
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문 즉시 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

/*        int index = 1; // 손님 대기 번호
        while (index <= 50) { // 대기 번호가 50 이하인 동안 반복
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            // 치킨 20마리가 모두 팔리면
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문 즉시 탈출
            }
            index++; // 다음 손님을 위해 대기 번호 1 증가
        }
        System.out.println("영업을 종료합니다.");*/
    }

}
