package chap_04;

public class _02_String2 {
    public static void main(String[] args) {
/*
        String s = "I like Java and Python and C.";
        // " and" 를 "," 로 변환
        System.out.println(s.replace(" and", ","));

        // 7번째 위치부터 끝까지 잘라내기
        System.out.println(s.substring(7));
        // 7번째 위치부터 끝까지 잘라내기
        System.out.println(s.substring(s.indexOf("Java")));
        // Java 시작 위치부터 . 시작 위치 바로 앞까지 잘라내기
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
*/

        // 문장 앞뒤로 공백 6칸씩 입력
        String s = "      I love Java.      ";
        // 공백 제거 전 원본 문자열 출력
        System.out.println(s);
        // 양쪽 끝 공백을 제거한 결과 출력
        System.out.println(s.trim());

        String s1 = "Java";
        String s2 = "Python";
        // + 연산자로 두 문자열 이어 붙이기
        System.out.println(s1 + s2);
        // 중간에 쉼표와 공백을 넣어 이어 붙이기
        System.out.println(s1 + ", " + s2);
        // concat()으로 문자열 결합하기
        System.out.println(s1.concat(",").concat(s2));

    }

}
