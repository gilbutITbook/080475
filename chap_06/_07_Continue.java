package chap_06;

public class _07_Continue {
    public static void main(String[] args) {
        int max = 20; // 하루에 판매할 수 있는 치킨 수
        int sold = 0; // 현재까지 판매된 치킨 수
        int noShow = 17; // 17번 손님이 노쇼

 /*       // 1번부터 50번 손님까지 순서대로 확인
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            // 노쇼 손님이라면
            if (i == noShow) {
                System.out.println(i + "번 손님, 안 계셔서 다음 손님에게 차례를 넘깁니다.");
                continue; // 이번 반복을 건너뛰고 다음 반복으로 이동
            }
*/


        int index = 0;   // 손님 대기 번호
        while (true) { // 일단 계속 반복
            index++;  // 반복이 시작되자마자 손님 번호 1 증가
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            // 노쇼 손님이라면
            if (index == noShow) {
                System.out.println(index + "번 손님, 안 계셔서 다음 손님에게 차례를 넘깁니다.");
                continue; // 이번 반복을 건너뛰고 다음 반복으로 이동
            }

            // 노쇼가 아니라면 치킨 판매
            sold++; // 판매된 치킨 수 1 증가
            System.out.println("판매 완료! 현재까지 판매량: " + sold + "마리");
            // 준비된 치킨이 모두 팔렸다면
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문 완전히 종료
            }
        }

        System.out.println("영업을 종료합니다.");
    }

}
