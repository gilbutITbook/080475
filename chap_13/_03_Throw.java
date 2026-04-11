package chap_13;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17; // 손님 나이를 만 17세로 가정
        try {
            if (age < 19) {
                //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("결제되었습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
