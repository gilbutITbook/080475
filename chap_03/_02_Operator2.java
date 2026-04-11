package chap_03;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 정수형 변수 num에 10을 저장
        int num = 10;
        // num의 현재 값에 2를 더한 뒤, 그 결과를 다시 num에 저장
        //num = num + 2;
        num += 2;
        // 변경된 값을 출력
        System.out.println(num);
        //num = num - 2; // 현재 값(12)에서 2 빼기
        num -= 2;
        System.out.println(num); // 10
        //num = num * 2; // 현재 값(10)에 2 곱하기
        num *= 2; // num = num * 2;
        System.out.println(num); // 20
        //num = num / 2; // 현재 값(20)을 2로 나누기
        num /= 2; // num = num / 2;
        System.out.println(num); // 10
        //num = num % 2; // 현재 값(10)을 2로 나눈 나머지
        num %= 2; // num = num % 2;
        System.out.println(num); // 0

    }
}