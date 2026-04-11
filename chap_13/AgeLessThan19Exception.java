package chap_13;

// Exception을 상속받아 사용자 정의 예외 클래스 생성
public class AgeLessThan19Exception extends Exception {
    // 생성자: 예외가 만들어질 때 실행
    public AgeLessThan19Exception(String message) {
        super(message); // 부모 클래스(Exception)에 메시지 전달
    }
}
