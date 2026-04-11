package chap_14;

public class _02_Output {
    public static void main(String[] args) {
        System.out.printf("%d%n", 1); // %d 위치에 정수 1을 넣고 %n으로 줄바꿈
        System.out.printf("%d %d %d%n", 1, 2, 3); // %d %d %d 위치에 각각 1, 2, 3 넣기

        System.out.printf("%d%n", 1234); // 네 자리 정수 출력
        System.out.printf("%6d%n", 1234); // 6칸 확보하고 오른쪽 정렬

        System.out.printf("%06d%n", 1234); // 빈 공간 0으로 채워 출력
        System.out.printf("%6d%n", -1234); // 오른쪽 정렬해 음수 출력

        System.out.printf("%+6d%n", 1234); // 오른쪽 정렬해 부호와 함께 출력
        System.out.printf("%-+6d%n", 1234); // 왼쪽 정렬해 출력

        System.out.printf("%,15d%n", 1000000000); // 세 자리마다 콤마로 구분

        System.out.printf("%f%n", Math.PI); // 소수점 이하 6자리까지 출력
        System.out.printf("%.2f%n", Math.PI); // 소수점 이하 둘째 자리까지 출력

        System.out.printf("%6.2f%n", Math.PI); // 소수점 둘째 자리까지 출력(오른쪽 정렬)
        System.out.printf("%-6.2f%n", Math.PI); // 소수점 둘째 자리까지 출력(왼쪽 정렬)

        System.out.printf("%06.2f%n", Math.PI); // 빈 공간을 0으로 채워 출력
        System.out.printf("%+6.2f%n", Math.PI); // 항상 부호 표시

        System.out.printf("%s%n", "Java"); // 문자열 출력
        System.out.printf("%6s%n", "Java"); // 6자리 공간 확보하고 우측 정렬
        System.out.printf("%-6s%n", "Java"); // 6자리 공간 확보하고 좌측 정렬

        System.out.printf("%6.2s%n", "Java"); // 우측 정렬해 2글자 출력
        System.out.printf("%-6.2s%n", "Java"); // 좌측 정렬해 2글자 출력

    }

}
