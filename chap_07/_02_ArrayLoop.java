package chap_07;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = { "아메리카노", "카페모카", "카페라떼", "카푸치노" };
        // for 반복문으로 배열의 모든 메뉴 출력하기
/*        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }
*/
        // 배열 길이를 직접 이용하기
/*
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }
*/
        // 향상된 for문(for-each)
        for (String coffee : coffees) {
            System.out.println(coffee + " 한 잔");
        }

        System.out.println("주세요.");

    }
    

}
