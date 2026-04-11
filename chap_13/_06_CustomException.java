package chap_13;

public class _06_CustomException {
    public static void main(String[] args) {
        int age = 17; // 손님 나이를 만 17세로 가정
        try {
            if (age < 19) { // 사용자 정의 예외 발생
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("결제되었습니다.");
            }
        } catch (AgeLessThan19Exception e) { // AgeLessThan19Exception만 처리
            System.out.println("조금 더 성장한 뒤에 오세요.");
            System.out.println(e.getMessage());
        } catch (Exception e) { // 그 외 모든 예외 처리
            System.out.println("모든 예외를 처리합니다.");
        }
    }

}
