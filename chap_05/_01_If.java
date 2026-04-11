package chap_05;

public class _01_If {
    public static void main(String[] args) {
        //int hour = 10; // 오전 10시
        //int hour = 15; // 오후 3시
/*        if (hour < 14) {
            System.out.println("아메리카노 + 1");
        }
        System.out.println("주문 완료");*/

        // 중괄호 없이 두 줄 이상의 코드를 실행하려는 경우
/*
        if (hour < 14)
            System.out.println("아메리카노 + 1");
            System.out.println("샷 추가"); // if 문과 상관없는 코드가 됨
*/

        // 중괄호로 실행할 코드의 범위를 명확히 지정
/*        if (hour < 14) {
            System.out.println("아메리카노 + 1");
            System.out.println("샷 추가"); // if 문과 상관없는 코드가 됨
        }*/

/*        int hour = 10; // 오전 10시
        boolean morningCoffee = false; // 모닝 커피는 아직 안 마심
        if (hour < 14 && !morningCoffee) {
            System.out.println("아메리카노 + 1");
        }*/

        int hour = 15; // 오후 3시
        boolean morningCoffee = false; // 모닝 커피 안 마심
        // 오후 2시 이후거나 모닝 커피를 마신 경우
        if (hour >= 14 || morningCoffee) {
            System.out.println("아메리카노(디카페인) + 1");
        }


        System.out.println("주문 완료");
    }
}

