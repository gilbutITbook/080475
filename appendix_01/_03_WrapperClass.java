package appendix_01;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스로 변수 만들기
        Integer i = 123;   // int i2 = 123;
        Double d = 1.0;    // double d2 = 1.0;
        Character c = 'A'; // char c2 = 'A';
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 1.0 -> 1로 형 변환
        System.out.println(c.charValue());

        String s = i.toString(); // Integer 객체의 값을 String(문자열)으로 변환
        System.out.println(s);
    }
}
