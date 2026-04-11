package chap_04;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이를 알고 싶을 때
        System.out.println(s.length()); // 변수 s에 저장된 문자열의 길이를 출력    }

        // 모든 글자를 대문자로 바꾸기
        System.out.println(s.toUpperCase());
        // 모든 글자를 소문자로 바꾸기
        System.out.println(s.toLowerCase());

        // Java 포함되어 있는지 확인
        System.out.println(s.contains("Java")); // 포함되어 있으면 true
        // C#이 포함되어 있는지 확인
        System.out.println(s.contains("C#")); // 포함되어 있지 않으면 false

        // Java가 시작되는 위치(index) 찾기
        System.out.println(s.indexOf("Java")); // 위치 정보 7
        // C#이 시작되는 위치 찾기
        System.out.println(s.indexOf("C#")); // 없으니까 -1

        // and가 처음 나오는 위치
        System.out.println(s.indexOf("and"));
        // and가 마지막으로 나오는 위치
        System.out.println(s.lastIndexOf("and"));

        // I like로 시작하는지 확인
        System.out.println(s.startsWith("I like"));

        // 마침표(.)로 끝나는지 확인
        System.out.println(s.endsWith("."));



    }
}
