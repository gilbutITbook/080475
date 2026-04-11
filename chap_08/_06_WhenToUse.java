package chap_08;

public class _06_WhenToUse {
    public static int getPower(int number) { // 숫자 하나를 받아 제곱 계산
        // return number * number;
        return getPower(number, 2); // 전달값을 2개 받는 메서드 재활용
    }

    // 거듭제곱을 계산하는 메서드
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result; // 계산 결과를 반환
    }

    public static void main(String[] args) {
/*        // 1. 2의 제곱 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result = result * 2;
        }
        System.out.println(result);
        // 2. 3의 세제곱 구하기
        result = 1; // result 값을 1로 초기화
        for (int i = 0; i < 3; i++) {
            result = result * 3;
        }
        System.out.println(result);
        // 3. 4의 제곱 구하기
        result = 1; // result 값을 1로 초기화
        for (int i = 0; i < 2; i++) {
            result = result * 4;
        }
        System.out.println(result);*/

        // 이제 메서드를 호출하기만 하면 계산 완료
/*        System.out.println(getPower(2, 2)); // 2의 제곱
        System.out.println(getPower(3, 3)); // 3의 세제곱
        System.out.println(getPower(4, 2)); // 4의 제곱*/

        System.out.println(getPower(2)); // 2의 제곱
    }

}
