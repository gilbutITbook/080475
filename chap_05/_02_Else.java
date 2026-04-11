package chap_05;

public class _02_Else {
    public static void main(String[] args) {
        int hour = 10;
        //int hour = 15;  // 오후 3시
  /*      if (hour < 14) { // 현재 시각이 14시(오후 2시) 이전이면
           System.out.println("아메리카노 + 1");
        } else { // 그렇지 않다면(14시이거나 그 이후라면)
          System.out.println("아메리카노(디카페인) + 1");
        }*/

        boolean morningCoffee = true; // 모닝 커피를 이미 마심
        if (hour >= 14 || morningCoffee) { // 오후 2시 이후거나 모닝 커피를 마신 경우
            System.out.println("아메리카노(디카페인) + 1");
        } else { // 그 외의 경우라면
            System.out.println("아메리카노 + 1");
        }

        System.out.println("주문 완료");
    }
}
