package chap_06;

public class _01_For {
    public static void main(String[] args) {
/*
        System.out.println("어서 오세요. 나코입니다.");
        System.out.println("어서 오세요. 나코입니다.");
        System.out.println("어서 오세요. 나코입니다.");
       // 이 코드를 100번 작성
*/

/*
        for (int i = 0; i < 10; i++) {
            System.out.println("어서 오세요. 나코입니다. " + i);
           //System.out.println("어서 오세요. 코나입니다. " + i);
        }
*/
/*
       // 짝수만 출력하기(0, 2, 4, 6, 8)
       for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " "); // print는 줄바꿈 없이 출력합니다.
        }
       // 홀수만 출력하기(1, 3, 5, 7, 9)
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
*/

/*        // 5부터 1까지 거꾸로 숫자 세기(5, 4, 3, 2, 1)
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
*/

        // 1부터 10까지 정수의 합(1 + 2 + ... + 10 = 55)
        int sum = 0; // 합계를 저장할 변수
        // i를 1부터 10까지 1씩 증가시키며 반복
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재 i = " + i + ", 현재까지 합계 = " + sum);
        }
        System.out.println("1부터 10까지 정수의 합계은 " + sum + "입니다.");


    }
}
