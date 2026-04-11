package chap_02;

public class _05_SpecialVariables {
    public static void main(String[] args) {
        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);
        long l = 1000000000000L;  // 0이 12개인 큰 수
        l = 1_000_000_000_000L; // 밑줄로 자릿수 구분
        System.out.println(l);

    }
}
