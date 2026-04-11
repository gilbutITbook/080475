package appendix_02;

import appendix_02.converter.*;

public class _03_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter(); // KRWConverter 객체 생성
        //converter.convert(2); // 2달러 변환 요청
        //convertUSD(converter, 2); // 2달러 변환 요청

        //convertUSD(
        //        USD -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 2);

        /*        Convertible convertible = // 람다식을 Convertible 타입의 변수에 할당
                USD -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        convertUSD(convertible, 2); // 2달러 변환 요청*/

        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        // 실행할 코드가 두 줄 이상이므로 중괄호로 감싸기
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + "원");
        };
        c1.convert();

        // 전달값 USD, KRW를 각각 d, w로 받아 사용
        ConvertibleWithTwoParams c2 =
                (d, w) -> System.out.println(d + "달러 = " + (d * w) + "원");
        c2.convert(10, 1400);

        // 두 값을 곱한 결과를 반환
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(20, 1400); // 반환 결과를 result 변수에 저장
        System.out.println("20달러 = " + result + "원");

    }
    // 객체를 전달받아 변환 기능을 호출하는 메서드
    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
