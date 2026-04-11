package chap_08;

public class _05_Overloading {
    // 정수(int) 값을 전달받는 getPower 메서드
    // 전달값이 1개인 getPower 메서드
    public static int getPower(int number) {
        return number * number;
    }
    // 문자열(String) 값을 전달받는 getPower 메서드
    public static int getPower(String strNumber) {
        // 문자열 "4"를 숫자 4로 변환
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    // 2. 전달값이 2개인 getPower 메서드
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

/*    // 2. double을 반환하는 getPower
    public static double getPower(int number) {
        return number * number;
    }*/



    public static void main(String[] args) {
        System.out.println(getPower(3));   // 정수 3 전달
        System.out.println(getPower("4")); // 문자열 "4" 전달

        System.out.println(getPower(3));    // 전달값이 1개
        System.out.println(getPower(3, 3)); // 전달값이 2개









    }

}
