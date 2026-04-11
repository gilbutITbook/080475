package chap_07;

public class _SelfCheck_07 {
    public static void main(String[] args) {
        // 1. 기내용 수하물 물품 6개 설정
        String[] items = {"옷", "지갑", "노트북", "이어폰", "스프레이", "비타민"};

        // 2. 발견 여부를 저장할 변수
        boolean found = false;

        // 3. 배열 순회 및 검사
        for (int i = 0; i < items.length; i++) {
            String item = items[i];

            // 4. 금지 물품(스프레이, 공구) 조건 확인
            if (item.equals("스프레이") || item.equals("공구")) {
                System.out.println(item + "가 발견되었습니다. 확인이 필요합니다.");
                found = true; // 발견 상태로 변경
                break; // 검사 중단
            }
        }

        // 5. 모든 검사를 마친 후 결과 처리
        if (!found) { // found가 false인 경우 (금지 물품이 없음)
            System.out.println("금지 물품이 발견되지 않았습니다. 안전하게 탑승하세요.");
        }
    }

}
