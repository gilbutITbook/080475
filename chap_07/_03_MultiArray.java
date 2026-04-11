package chap_07;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 각 줄(row)을 별도의 1차원 배열로 표현
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // B2 좌석에 접근하기(1번 줄, 1번 칸)
        System.out.println(seats[1][1]);
        // C5 좌석에 접근하기(2번 줄, 4번 칸)
        System.out.println(seats[2][4]);

        String[][] seats2 = {
                {"A1", "A2", "A3"},            // 첫 줄은 3칸
                {"B1", "B2", "B3", "B4"},      // 둘째 줄은 4칸
                {"C1", "C2", "C3", "C4", "C5"} // 셋째 줄은 5칸
        };
        // A3 좌석에 접근하기(0번 줄, 2번 칸)
        System.out.println(seats2[0][2]);
        // A5에 접근
        System.out.println(seats2[0][4]); // 0번 줄에는 4번 칸이 없음


    }

}
