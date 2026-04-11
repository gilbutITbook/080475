package chap_12;

import java.util.*;

public class _05_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 데이터 추가하기
        list.add("홍길동");
        list.add("(알 수 없음)");
        list.add("임꺽정");
        list.add("(알 수 없음)");
        list.add("이몽룡");
        list.add("(알 수 없음)");
        list.add("전우치");
        list.add("(알 수 없음)");
        System.out.println("--- 현재 수강 신청자 명단 ---");
        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> it = list.iterator(); // 이터레이터 객체 얻기
        System.out.println("--- next()로 데이터 꺼내기 ---");
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--- 전체 수강 신청자 명단 ---");
        it = list.iterator(); // 커서를 처음 위치로 되돌림
        while (it.hasNext()) { // hasNext()로 가져올 데이터가 있는지 확인해서 반복
            System.out.println(it.next()); // 있으면 꺼내서 출력
        }

        System.out.println("--- 잘못된 데이터 삭제 ---");
        it = list.iterator(); // 커서를 처음으로 이동
        while (it.hasNext()) { // 반복문으로 모든 데이터 확인
            String s = it.next(); // 일단 데이터를 꺼내서
            if (s.contains("(알 수 없음)")) { // 확인하고
                it.remove(); // 조건에 맞으면 바로 삭제
            }
        }
        // 삭제가 잘 되었는지 다시 순회하며 출력
        System.out.println("--- 잘못된 데이터 삭제 후 명단 ---");
        it = list.iterator(); // 커서를 다시 처음으로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("임꺽정");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("홍길동", 10); // 키: 홍길도, 값: 10
        map.put("임꺽정", 5); // 키: 임꺽정, 값: 5
        System.out.println("--- 방법 1: 키만 순회하기 ---");
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("--- 방법 2: 값만 순회하기 ---");
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("--- 방법 3: 키-값 쌍으로 순회하기(추천) ---");
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }

    }
}
