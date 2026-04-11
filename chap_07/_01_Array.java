package chap_07;

public class _01_Array {
    public static void main(String[] args) {
        // 4명의 커피 주문을 각 변수에 저장
/*
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";
        System.out.println(coffeeRoss + " 한 잔");
        System.out.println(coffeeRachel + " 한 잔");
        System.out.println(coffeeChandler + " 한 잔");
        System.out.println(coffeeMonica + " 한 잔");
        System.out.println("주세요.");
*/

        // 방법 1: 공간을 먼저 만들고 나중에 값 넣기
/*        String[] coffees = new String[4]; // 문자열 4개를 담을 수 있는 배열 생성
        // 각 칸에 값 저장하기
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "카페라떼";
        coffees[3] = "카푸치노";*/

        // 방법 2: 배열을 만들면서 동시에 값 채우기(가장 추천!)

        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
        // 배열을 이용해 커피 주문하기
        System.out.println(coffees[0] + " 한 잔"); // 배열의 0번 인덱스 값 출력
        System.out.println(coffees[1] + " 한 잔"); // 배열의 1번 인덱스 값 출력
        coffees[2] = "에스프레소"; // 카페라떼 → 에스프레소로 값 변경
        System.out.println(coffees[2] + " 한 잔"); // 배열의 2번 인덱스 값 출력
        System.out.println(coffees[3] + " 한 잔"); // 배열의 3번 인덱스 값 출력
        System.out.println("주세요.");

        int[] numbers = {1, 2, 3, 4, 5}; // 정수형 배열
        double[] heights = {175.5, 180.2, 165.8}; // 실수형 배열
        boolean[] isPassed = {true, false, true, true}; // 논리형 배열


    }


}
