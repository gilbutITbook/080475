package chap_08;

public class _07_VariableScope {
/*
    // methodA라는 새로운 메서드
    public static void methodA() {
        // main 메서드에 있는 number 변수를 출력하려고 시도
        System.out.println(number); // 오류 발생
    }
*/

/*
    public static void methodB() {
        // methodB 안에서만 사용할 수 있는 지역 변수
        int result = 1;
    }
*/

    public static void main(String[] args) {
/*        // main 메서드 안에서 정수형 변수 number 선언
        int number = 3;
        // methodB에 있는 result 변수를 출력하려고 시도
        System.out.println(result); // 오류 발생*/
/*
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i는 for 문 블록 안에서 사용 가능
        }

        // for 문이 끝난 후 i를 사용하려고 시도
        System.out.println(i); // 오류 발생
*/

/*
        {
            int j = 100;
            System.out.println(j);
        }
        // 중괄호 밖에서 j를 사용하려고 시도
        System.out.println(j); // 오류 발생

*/

        int number = 3; // 바깥쪽 스코프에 선언
        {
            int j = 0;
            System.out.println("안쪽에서 선언한 j: " + j);
            // 바깥쪽 스코프의 number 변수 사용
            System.out.println("안쪽에서 바라본 number: " + number);
        }



        // 중괄호 밖에서 j를 사용하려고 시도
        //System.out.println(j); // 오류 발생

    }

}

