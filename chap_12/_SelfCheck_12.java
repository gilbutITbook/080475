package chap_12;

import java.util.HashSet;

public class _SelfCheck_12 {
    public static void main(String[] args) {
        // 1. HashSet 생성
        HashSet<String> participantSet = new HashSet<>();

        // 2. 응모자 데이터 추가
        participantSet.add("김가영");
        participantSet.add("이승철");
        participantSet.add("정다혜");
        participantSet.add("김가영"); // 중복 데이터
        participantSet.add("송재승");

        // 3. 최종 인원 확인
        System.out.println("최종 응모 인원: " + participantSet.size() + "명");

        // 4. 특정 인물 확인
        if (participantSet.contains("이승철")) {
            System.out.println("이승철님 응모 확인 완료");
        }

        // 5. 명단 전체 출력
        System.out.println("--- 당첨 후보자 명단 (순서 무관) ---");
        for (String name : participantSet) {
            System.out.println(name);
        }
    }

}
