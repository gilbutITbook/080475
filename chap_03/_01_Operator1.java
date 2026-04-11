package chap_03;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 일반 연산
        System.out.println(4 + 2); // 덧셈
        System.out.println(4 - 2); // 뺄셈
        System.out.println(4 * 2); // 곱셈
        System.out.println(4 / 2); // 나눗셈
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2); // 4를 2로 나눈 나머지
        System.out.println(5 % 2); // 5를 2로 나눈 나머지
        // 우선순위 연산
        System.out.println(2 + 2 * 2);   // 곱셈 먼저
        System.out.println((2 + 2) * 2); // 괄호가 있으므로 덧셈 먼저
        System.out.println(2 + (2 * 2)); // 괄호가 있으므로 곱셈 먼저
        int a = 20;
        int b = 10;
        int c;
        c = a + b; // a 와 b 를 더한 결과를 c 에 저장
        System.out.println(c); // 30
        c = a - b; // a 에서 b 를 뺀 결과를 c 에 저장
        System.out.println(c); // 10
        c = a * b; // a 와 b 를 곱한 결과를 c 에 저장
        System.out.println(c); // 200
        c = a / b; // a 에서 b 를 나눈 몫을 c 에 저장
        System.out.println(c); // 2
        c = a % b; // a 에서 b 를 나눈 나머지를 c 에 저장
        System.out.println(c); // 0

        // 증감 연산자
        int val;
        val = 10;
        System.out.println(val);   // 10 출력
        System.out.println(++val); // 값을 먼저 1 증가시킨 후 출력(11)
        System.out.println(val);   // 이미 증가된 값이므로 11 출력
        val = 10;
        System.out.println(val); // 10 출력
        System.out.println(val++); // 현재 값을 먼저 출력한 뒤 1 증가(10 출력)
        System.out.println(val); // 증가된 값 출력(11)
        val = 10;
        System.out.println(val);   // 10 출력
        System.out.println(--val); // 값을 먼저 1 감소시킨 후 출력 (9)
        System.out.println(val);   // 이미 감소된 값이므로 9 출력
        val = 10;
        System.out.println(val);     // 10 출력
        System.out.println(val--);   // 현재 값을 먼저 출력(10)한 후 값 감소
        System.out.println(val);     // 감소된 값 출력(9)
        // 은행 대기표
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++); // 1번 고객
        System.out.println("대기 인원: " + waiting++); // 2번 고객
        System.out.println("대기 인원: " + waiting++); // 3번 고객
        System.out.println("총 대기 인원: " + waiting);

    }
}
