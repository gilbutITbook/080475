package chap_07;

public class _05_ASCII {
    public static void main(String[] args) {
        // char 자료형 변수 c에 문자 'A'를 저장
/*
        char c = 'A'; // c는 'A'(아스키 코드 65)
        // 문자 그대로 출력
        System.out.println(c);
        // 변수 c의 값을 int로 바꿔 출력
        System.out.println((int) c);

        System.out.println("연산 전 문자: " + c);
        System.out.println("연산 전 아스키 코드: " + (int) c);
        c++; // c에 1을 더함(65 + 1 = 66)
        System.out.println("연산 후 문자: " + c);
        System.out.println("연산 후 아스키 코드: " + (int) c);
*/

        // 세로 10 x 가로 15 크기의 2차원 문자열 배열 생성
        String[][] seats = new String[10][15];
        // 좌석 줄을 나타낼 char 변수, 'A'부터 시작
        char ch = 'A';
        // 반복문으로 좌석 정보 채우기
        for (int i = 0; i < seats.length; i++) { // 세로(줄) 반복
            for (int j = 0; j < seats[i].length; j++) { // 가로(칸) 반복
                seats[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++; // 한 줄이 끝나면 다음 알파벳으로 증가(A -> B -> C ...)
        }
        // 완성된 좌석표 출력
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); // 한 줄 출력이 끝나면 줄바꿈
        }

    }
}
