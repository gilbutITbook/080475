package chap_12;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // 구매 물품 메모지에 적기
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살"); // 중복 추가
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살"); // 또 중복 추가
        System.out.println("총 구매 상품 수 : " + set.size());
        System.out.println("--- 메모 목록 ---");
        for (String item : set) { // 메모지에 적힌 상품 확인
            System.out.println(item);
        }

        // 1. 상품이 있는지 확인하기(contains)
        System.out.println("--- 메모지 확인 ---");
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살이 있어요. 사러 갑시다!");
        }
        // 2. 특정 상품 빼기(remove)
        System.out.println("구매할 총 상품 수(삼겹살 구매 전): " + set.size());
        System.out.println("--- 삼겹살 구매 완료 ---");
        set.remove("삼겹살"); // 삼겹살 구매 후 메모지에서 삭제
        System.out.println("구매할 총 상품 수(삼겹살 구매 후): " + set.size());
        // 3. 메모지 전체 삭제(clear)
        System.out.println("--- 메모지 전체 삭제 ---");
        set.clear(); // 모든 상품 구매 완료
        // 4. 메모지가 비었는지 확인하기(isEmpty)
        if (set.isEmpty()) {
            System.out.println("남은 구매할 상품 수: " + set.size());
        }

        // 순서를 보장하지 않는 HashSet
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        System.out.println("--- HashSet 결과 ---");
        for (int i : intSet) {
            System.out.println(i);
        }
        // 순서를 보장하는 LinkedHashSet
        LinkedHashSet<Integer> linkedIntSet = new LinkedHashSet<>();
        linkedIntSet.add(1);
        linkedIntSet.add(13);
        linkedIntSet.add(2);
        System.out.println("--- LinkedHashSet 결과 ---");
        for (int i : linkedIntSet) {
            System.out.println(i);
        }

    }
}
