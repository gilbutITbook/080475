package chap_08;

public class _02_Parameter {
    // 전달값이 있는 메서드 정의
    public static void power(int number) { // int number가 매개변수
        int result = number * number;
        System.out.println(number + "의 제곱은 " + result + "입니다.");
    }

    // 매개변수가 2개인 메서드 정의
    public static void powerByExp(int number, int exponent) {
        int result = 1; // 결과를 저장할 변수(곱셈이므로 1로 시작)
        for (int i = 0; i < exponent; i++) {
            result *= number; // result = result * number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        // power 메서드에 숫자 2를 전달하며 호출
        power(2); // 2 * 2 = 4
        // 숫자 3를 전달하며 호출
        power(3); // 3 * 3 = 9

        // 인수 2개를 전달하며 메서드 호출
        powerByExp(2, 3); // 2의 3승 계산
        powerByExp(3, 3); // 3의 3승 계산
        powerByExp(10, 0); // 10의 0승 계산

        }

}
