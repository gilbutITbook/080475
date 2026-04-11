package chap_07;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 3 x 5 크기의 2차원 배열 선언
/*
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // f중첩 반복문으로 전체 좌석 출력
        for (int i = 0; i < 3; i++) {     // 바깥쪽 for 문: 줄(행) 기준
            for (int j = 0; j < 5; j++) { // 안쪽 for 문: 칸(열) 기준
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); // 한 줄 출력이 끝나면 줄 바꿈
        }
*/

       String[][] seats2 = {
               {"A1", "A2", "A3"},
               {"B1", "B2", "B3", "B4"},
               {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < seats2.length; i++) {        // 줄 수
            for (int j = 0; j < seats2[i].length; j++) { // 칸 수
                System.out.print(seats2[i][j] + " ");    // A1 A2 A3...
            }
            System.out.println();
        }

        // 10 x 15 크기의 빈 2차원 배열 만들기
        String[][] seats3 = new String[10][15];
        // 좌석 줄 이름으로 사용할 알파벳 배열
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        // 반복문으로 좌석 번호 생성해 배열에 넣기
        for (int i = 0; i < seats3.length; i++) { // 세로(줄)
            for (int j = 0; j < seats3[i].length; j++) { // 가로(칸)
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // H9, H10 좌석이 판매되었다고 표시
        seats3[7][8] = "__";  // H9 좌석(원래 "H9")
        seats3[7][9] = "___"; // H10 좌석(원래 "H10")

        // 전체 좌석표 출력
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
