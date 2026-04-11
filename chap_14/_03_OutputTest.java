package chap_14;

public class _03_OutputTest {
    public static void main(String[] args) {
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5);

        System.out.println("이름      영어   수학   평균");
        // 이름: 6칸 확보, 왼쪽 정렬(%-6s)
        // 영어, 수학 점수: 4칸 확보, 오른쪽 정렬(%4d)
        // 평균 점수: 6칸 확보, 소수점 첫째 자리까지 오른쪽 정렬(%6.1f)
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("ABCDEFG");        // 영문 7글자
        System.out.println("가나다라마바사"); // 한글 7글자
        System.out.println("가 나 다 라");   // 한글 + 띄어쓰기 총 7글자
    }

}
