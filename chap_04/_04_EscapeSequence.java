package chap_04;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요.");

        // \n을 사용해 여러 줄 출력
        System.out.println("자바가\n너무\n재밌어요.");

        // \t를 두 번 사용해 간격을 넓힘
        System.out.println("해물파전\t\t9,000원");
        System.out.println("김치전\t\t8,000원");
        System.out.println("부추전\t\t8,000원");

        // 역슬래시 출력
        System.out.println("C:\\Program Files\\Java");
        // 큰따옴표 출력
        System.out.println("단비가 \"냐옹\"이라고 했어요.");
        // 작은따옴표 출력
        System.out.println("단비가 \'뭘 봐?\' 하는 표정을 지었어요.");
        // 작은따옴표는 문자열 안에서는 그냥 써도 됨
        System.out.println("단비가 '뭘 봐?' 하는 표정을 지었어요.");

        char c = 'A'; // char 변수에 A 문자 저장
        c = '\''; // char 변수에 작은따옴표 문자 저장
        System.out.println(c);

    }
}
