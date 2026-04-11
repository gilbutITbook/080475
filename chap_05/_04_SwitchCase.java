package chap_05;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // if 문으로 작성한 장학금 예제
/*        // 석차에 따른 장학금 지급
        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        // 그 외: 장학금 대상 아님
        int ranking = 1; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");*/

/*
        // switch-case 문으로 작성한 장학금 예제
        int ranking = 2; // 등수
        switch (ranking) {
            case 1: // ranking 의 값이 1이라면
                System.out.println("전액 장학금");
                break; // switch 문 빠져나가기
            case 2: // ranking 의 값이 2라면
*/
/*                System.out.println("반액 장학금");
                break; // switch 문 빠져나가기*//*

            case 3: // ranking 의 값이 3이라면
                System.out.println("반액 장학금");
                break; // switch 문 빠져나가기
            default: // 그 외의 모든 경우
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");
*/

        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // 1,000원 추가(break 없음)
            case 2:
                price += 1000; // 1,000원 추가(break 없음)
            case 3:
                price += 1000; // 1,000원 추가
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");





    }
}
