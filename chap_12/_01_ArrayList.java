package chap_12;

import java.util.ArrayList;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // <String> : 이 리스트에는 문자열(String)만 담겠다는 의미
        ArrayList<String> list = new ArrayList<>();
        System.out.println("수강 신청을 시작합니다!");
        // 데이터 추가하기
        list.add("김하늘"); // 1번째 신청자
        list.add("이준호"); // 2번째 신청자
        list.add("박서윤"); // 3번째 신청자
        list.add("최도현"); // 4번째 신청자
        list.add("정유나"); // 5번째 신청자
        // 데이터 조회
        System.out.println("--- 현재 수강 신청자 명단 ---");
        System.out.println(list.get(0)); // 0번 인덱스 -> 첫 번째 데이터
        System.out.println(list.get(1)); // 1번 인덱스 -> 두 번째 데이터
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--- 수강생 변동 ---");
        System.out.println("신청 학생 수(취소 전): " + list.size()); // 5
        list.remove("최도현"); // "최도현" 데이터 삭제
        System.out.println("신청 학생 수(취소 후): " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("--- 수강생 축소 ---");
        System.out.println("남은 학생 수(제외 전): " + list.size());
        list.remove(list.size() - 1); // 마지막 데이터 삭제
        System.out.println("남은 학생 수(제외 후): " + list.size());

        System.out.println("--- 최종 수강생 명단 ---");
        // 리스트 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--- 수강권 양도 ---");
        System.out.println("수강권 양도 전: " + list.get(0));
        list.set(0, "이준서"); // 0번 인덱스의 값을 "이준서"로 변경
        System.out.println("수강권 양도 후: " + list.get(0));

        System.out.println("--- 수강 여부 확인 ---");
        // contains(값): 포함 여부를 true/false로 반환
        if (list.contains("박서윤")) {
            System.out.println("수강 신청 목록에 포함되어 있습니다. 환영합니다!");
        } else {
            System.out.println("아쉽지만, 수강 신청 목록에 존재하지 않습니다.");
        }
        // indexOf(값): 값이 있으면 인덱스 번호, 없으면 -1 반환
        System.out.println("박서윤 학생은 " + list.indexOf("박서윤") + "번 인덱스에 있습니다.");

        System.out.println("--- 수강생 데이터 삭제 ---");
        list.clear(); // 전체 삭제
        if (list.isEmpty()) { // 리스트가 비었는지 확인
            System.out.println("수강생 명단이 비었습니다. 현재 학생 수: " + list.size());
        }

        // 새로운 학기 수강생 추가
        list.add("김하늘");
        list.add("이준호");
        list.add("박서윤");
        list.add("최도현");
        list.add("정유나");
        Collections.sort(list); // 정렬하기(가나다순)
        System.out.println("--- 새학기 출석부(가나다순) ---");
        for (String s : list) {
            System.out.println(s);
        }
    }
}