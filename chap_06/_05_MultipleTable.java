package chap_06;

public class _05_MultipleTable {
    public static void main(String[] args) {
/*
       for (int i = 1; i < 10; i++) {
        // i는 1부터 9까지 1씩 증가하며 반복
            System.out.println("2 x " + i + " = " + (2 * i));
        }
*/

        // 중첩 반복문을 이용한 전체 구구단 출력
       for (int i = 2; i < 10; i++) { // 바깥쪽 반복문: 2단부터 9단까지 변경 담당
            for (int j = 1; j < 10; j++) { // 안쪽 반복문: 각 단에 1~9 곱하기 담당
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 한 단이 끝나면 한 줄 띄우기
        }

    }

}
