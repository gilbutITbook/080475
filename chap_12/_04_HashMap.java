package chap_12;

import java.util.HashMap;

public class _04_HashMap {
    public static void main(String[] args) {
        // 맵(키, 값) 만들기, 키는 고객 이름(String), 값은 포인트 점수(Integer)
        HashMap<String, Integer> map = new HashMap<>();
        // 데이터 추가하기
        map.put("홍길동", 10); // "홍길동"이라는 키에 10이라는 값을 연결
        map.put("임꺽정", 5);
        map.put("이몽룡", 3);
        map.put("전우치", 15); // 기존에 15 포인트가 적립된 고객

        // 데이터가 몇 개인지 확인하기
        System.out.println("총 고객 수: " + map.size()); // 맵에 저장된 데이터 수 확인
        // 데이터 조회하기
        System.out.println("홍길동 님의 포인트: " + map.get("홍길동"));
        System.out.println("임꺽정 님의 포인트: " + map.get("임꺽정"));

        if (map.containsKey("전우치")) {  // "전우치"라는 고객이 맵에 있는지 확인
            // 이미 존재하는 고객이라면, 기존 포인트에 1점을 추가
            int point = map.get("전우치"); // 현재 포인트 조회
            map.put("전우치", ++point);    // 1점을 더해 다시 저장
            System.out.println("전우치 님의 누적 포인트: " + map.get("전우치"));
        } else { // 존재하지 않는 고객이라면, 신규 등록
            map.put("전우치", 1);         // "전우치"라는 키로 1 포인트 저장
            System.out.println("전우치 님 신규 등록(포인트 1)");
        }

        System.out.println("--- 고객 정보 삭제 ---");
        map.remove("홍길동"); // 홍길동 고객의 데이터 삭제
        System.out.println(map.get("홍길동"));

        System.out.println("--- 고객 정보 전체 삭제 ---");
        map.clear(); // 전체 삭제
        if (map.isEmpty()) { // 맵이 비어 있는지 확인
            System.out.println("남은 고객 수: " + map.size());
            System.out.println("가게 문을 닫아야겠어요.");
        }

        // 고객 정보 추가
        map.put("홍길동", 10);
        map.put("임꺽정", 5);
        map.put("이몽룡", 3);
        map.put("전우치", 15);
        System.out.println("--- 고객 이름 ---");
        for (String key : map.keySet()) { // keySet()으로 모든 키를 순회
            System.out.println(key);
        }
        System.out.println("--- 누적 포인트 ---");
        for (int value : map.values()) { // values()로 모든 값을 순회
            System.out.println(value);
        }

        System.out.println("--- 고객별 누적 포인트 ---");
        for (String key : map.keySet()) { // keySet()으로 모든 키를 순회
            System.out.println("고객 이름: " + key + "\t\t포인트: "
                    + map.get(key));
        }
        System.out.println("변경 전 포인트: " + map.get("이몽룡"));
        // 같은 키("이몽룡")로 새로운 값을 여러 번 저장
        map.put("이몽룡", 5);
        map.put("이몽룡", 10);
        System.out.println("변경 후 포인트: " + map.get("이몽룡"));
    }
}
