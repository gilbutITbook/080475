package chap_13;

public class _04_finally {
    public static void main(String[] args) {
/*        try {
            System.out.println("택시 문을 연다.");
            //throw new Exception("휴무 택시"); // 예외를 발생시킴
            System.out.println("택시에 탑승한다."); // 정상 실행
        } catch (Exception e) {
            System.out.println("문제 발생: " + e.getMessage());
        } finally {
            System.out.println("택시 문을 닫는다.");
        }*/

        try {
            System.out.println(3 / 0); // ArithmeticException 발생
        } finally { // 예외 발생 여부와 관계없이 반드시 실행
            System.out.println("finally 정상 실행");
        }
        System.out.println("프로그램 정상 종료"); // 실행되지 않음
    }
}
