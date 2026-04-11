package chap_04;

public class _SelfCheck_04 {
    public static void main(String[] args) {
        // 1. 이메일 주소 변수 선언
        String email = "nadocoding@gmail.com";
        // 2. '@' 기호의 위치 찾기
        int index = email.indexOf("@");
        // 3. substring을 이용한 문자열 분리
        String id = email.substring(0, index); // 0부터 index 전까지 추출(아이디)
        String domain = email.substring(index + 1); // index + 1부터 끝까지 추출(도메인)
        // 4. 결과 출력
        System.out.println("이메일 아이디: " + id);
        System.out.println("이메일 도메인: " + domain);
    }
}
