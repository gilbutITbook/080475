package chap_12;

import java.util.Collections;
import java.util.LinkedList;

public class _02_LinkedList {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        System.out.println("수강 신청을 시작합니다!");
        list.add("김하늘");
        list.add("이준호");
        list.add("박서윤");
        list.add("최도현");
        list.add("정유나");

        // 데이터 조회(인덱스)
        System.out.println("--- 수강 신청자 명단 일부 ---");
        System.out.println(list.get(0)); // 0번 인덱스(첫 번째 데이터 조회)
        System.out.println(list.get(1)); // 1번 인덱스(두 번째 데이터 조회)
        // LinkedList의 편리한 기능
        System.out.println("--- 처음과 마지막 수강 신청자 ---");
        System.out.println(list.getFirst()); // 첫 번째 데이터 조회
        System.out.println(list.getLast());  // 마지막 데이터 조회

        System.out.println("--- 수강생 변동 ---");
        list.addFirst("이준서"); // 맨 앞에 데이터 추가
        for (String s : list) { // 전체 목록 출력
            System.out.println(s);
        }
        System.out.println("--- 수강생 추가 ---");
        list.addLast("정민준"); // 맨 끝에 데이터 추가
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--- 수강생 또 추가 ---");
        System.out.println("학생 추가 전(index 1): " + list.get(1));
        list.add(1, "박민서"); // 1번 인덱스 위치에 데이터 추가
        System.out.println("학생 추가 후(index 1): " + list.get(1));
        System.out.println("학생 추가 후(index 2): " + list.get(2));

        System.out.println("--- 수강생 제외 ---");
        System.out.println("남은 학생 수(제외 전): " + list.size());
        list.remove(list.size() - 1); // 마지막 데이터 삭제
        System.out.println("남은 학생 수(제외 후): " + list.size());

        System.out.println("--- 수강생 변동 ---");
        System.out.println("남은 학생 수(전학 전): " + list.size());
        list.removeFirst(); // 첫 번째 데이터 삭제
        list.removeLast();  // 마지막 데이터 삭제
        System.out.println("남은 학생 수(전학 후): " + list.size());

        System.out.println("--- 수강권 양도 ---");
        System.out.println("수강권 양도 전: " + list.get(0));
        list.set(0, "김하늘"); // 0번 인덱스의 값을 변경
        System.out.println("수강권 양도 후: " + list.get(0));
        System.out.println("--- 수강 여부 확인 ---");
        if (list.contains("박서윤")) {
            System.out.println("수강 신청 목록에 포함되어 있습니다. 환영합니다!");
        } else {
            System.out.println("아쉽지만, 수강 신청 목록에 존재하지 않습니다.");
        }
        System.out.println("박서윤 학생은 " + list.indexOf("박서윤")
                + "번 인덱스에 있습니다.");

        System.out.println("--- 수강생 데이터 삭제 ---");
        list.clear(); // 전체 삭제
        if (list.isEmpty()) { // 리스트가 비어 있는지 확인
            System.out.println("수강생 명단이 비었습니다. 현재 학생 수: " + list.size());
        }
        // 새로운 학기 수강생 추가
        list.add("김하늘");
        list.add("이준호");
        list.add("박서윤");
        list.add("최도현");
        list.add("정유나");
        Collections.sort(list); // 정렬
        System.out.println("--- 새학기 출석부(가나다순) ---");
        for (String s : list) {
            System.out.println(s);
        }


    }
}