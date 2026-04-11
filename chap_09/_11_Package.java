package chap_09;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // Random 클래스로 새로운 random 객체 생성
        Random random = new Random();
        System.out.println("--- 정수(int) 난수 생성 ---");
        System.out.println("[1] int 전체 범위(-21억~+21억) 정수: " + random.nextInt());
        System.out.println("[2] 0 이상 10 미만의 정수: " + random.nextInt(10));
        System.out.println("[3] 50 이상 100 미만의 정수): " + random.nextInt(50, 100));
        System.out.println("--- 실수(double) 난수 생성 ---");
        System.out.println("[4] 0.0 이상 1.0 미만의 실수: " + random.nextDouble());
        System.out.println("[5] 0.0 이상 5.0 미만의 실수: " + random.nextDouble(5.0));
        System.out.println("[6] 10.0 이상 20.0 미만의 실수: "
                + random.nextDouble(10.0, 20.0));
        System.out.println("--- 논리(boolean) 난수 생성 ---");
        System.out.println("[7] 참 또는 거짓 중 하나: " + random.nextBoolean());

        // 로또 번호 범위: 1~45
        System.out.println("이번 주 로또 번호 추천: " + random.nextInt(1, 46));

    }
}
