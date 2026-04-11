package chap_05;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 각 음료가 있는지 여부
        boolean hallabongAde = false; // 한라봉 에이드
        boolean mangoJuice = false; // 망고 주스도
        boolean orangeJuice = false; // 오렌지 주스
        if (hallabongAde) { // 1순위: 한라봉 에이드가 있는가?
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice) { // 2순위: 한라봉 에이드가 없다면, 망고 주스는 있는가?
            System.out.println("망고 주스 + 1");
        } else if (orangeJuice) { // 세 번째 선택지 추가
            System.out.println("오렌지 주스 + 1");
/*        } else { // 음료가 모두 없다면?
            System.out.println("아메리카노 + 1");*/
        }
        System.out.println("주문 완료");
    }

}
