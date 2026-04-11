package chap_06;

public class _Quiz_06 {
    public static void main(String[] args) {
        // 주어진 조건 변수들 (전체 대여 기간을 바꿔서 테스트해 보세요)
        int totalDays = 10;    // 전체 대여 기간
        int rentalPeriod = 7;  // 정상 대여 기간
        int fine = 0;          // 누적 연체료

        System.out.println("===================");
        System.out.println("도서관 스마트 알리미");
        System.out.println("===================");

        // 일자별 대여 정보 출력
        for (int day = 1; day <= totalDays; day++) {
            if (day <= rentalPeriod) {
                // 7일까지는 정상 대여 기간
                int remainingDays = rentalPeriod - day;
                System.out.println(day + "일 차: 정상 대여 중 (반납까지 "
                        + remainingDays + "일 남음)");
            } else {
                // 8일 차부터는 연체 발생
                fine += 500; // 하루에 500원씩 추가
                System.out.println(day + "일 차: [연체] 누적 연체료: " + fine + "원");
            }
        }
        System.out.println("===================");
        System.out.println("최종 안내: 미반납 시 총 연체료는 " + fine + "원입니다.");
    }


}
