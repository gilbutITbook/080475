package chap_13;

public class _01_TryCatch {
    public static void main(String[] args) {
/*
        int[] arr = new int[3]; // 3칸짜리 정수 배열 생성(인덱스: 0, 1, 2)
        arr[5] = 100; // 존재하지 않는 인덱스에 접근
        System.out.println("프로그램이 무사히 끝났습니다.");
*/

/*        S s = new S();
        s.methodA();*/

/*
        try { // 예외가 발생할 수 있는 코드를 시도
            System.out.println("나누기 계산을 시작합니다.");
            int result = 3 / 0; // 0으로 나누는 순간 예외 발생
            System.out.println("계산 결과: " + result); // 실행되지 않음
        } catch (Exception e) { // 예외가 발생하면 이 블록이 실행
            System.out.println("이런! 문제가 발생했어요.");
            System.out.println("문제 내용: " + e.getMessage());
        }
        System.out.println("프로그램 정상 종료");

*/

/*
        try {
            // 3칸짜리 배열 (0, 1, 2번 칸만 존재)
            int[] arr = new int[3];
            // 5번째 칸(인덱스 5)에 접근 시도
            arr[5] = 100;
            System.out.println("배열에 값을 할당했습니다.");
        } catch (Exception e) {
            System.out.println("이런! 문제가 발생했어요.");
            System.out.println("문제 내용: " + e.getMessage());
        }
        System.out.println("프로그램 정상 종료");

*/


        try {
            Object obj = "test"; // Object는 모든 참조 타입을 담을 수 있음
            int num = (int) obj; // 문자열이 담긴 객체를 정수형으로 강제 형 변환
            System.out.println("형 변환 성공: " + num);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요. => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

    }
}


/*
class S {
    public void methodA() {
        this.methodA();
    }
}
*/

