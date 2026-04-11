package chap_04;

public class _03_StringCompare {
    public static void main(String[] args) {
  /*      String s1 = "Java";
        String s2 = "Python";
        // s1과 s2의 값이 같은지 비교
        System.out.println(s1.equals(s2));
        // s1의 내용이 "Java"와 같은지 비교
        System.out.println(s1.equals("Java"));
        // s2의 내용이 "python"과 같은지 비교
        System.out.println(s2.equals("python"));
        // 대소문자 무시하고 비교
        System.out.println(s2.equalsIgnoreCase("python"));
       */

/*
        // 하나의 메모지를 보는 경우
        String s1 = "1234";
        String s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
*/

        // s1과 s2에게 각각 메모지를 주는 경우
        String s1 = new String("1234");
        String s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }
}
