package chap_06;

public class _04_NestedLoop {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 5; i++) {
            System.out.print("*"); // 별을 찍고 줄은 바꾸지 않음
        }
*/
/*
        // 바깥쪽 반복문: 세로 방향으로 5번 반복(줄 제어)
        for (int i = 0; i < 5; i++) {
            // 안쪽 반복문: 가로 방향으로 5번 반복(별 출력)
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
*/
/*
        // 바깥쪽 반복문: 전체 줄의 개수 결정(총 5줄)
        for (int i = 0; i < 5; i++) {
            // 안쪽 반복문: i 값만큼 별 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
*/

        // 바깥쪽 반복문: 전체 줄의 개수 결정(총 5줄)
        for (int i = 0; i < 5; i++) {
            // 공백(S)를 출력하는 반복문
            for (int j = 0; j < 4 - i; j++) {
                //System.out.print("S");
                System.out.print(" ");
            }
            // 별(*)을 출력하는 반복문
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }

            // 한 줄 출력이 끝나면 줄 바꿈
            System.out.println();
        }
    }
}

