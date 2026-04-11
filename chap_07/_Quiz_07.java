package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        // 1. String 배열에 친구가 좋아하는 음식 3가지를 저장
        String[] favoriteFoods = {"떡볶이", "치킨", "파스타"};
        System.out.println("--- 친구의 최애 음식 ---");
        // 2. for문을 사용하여 배열의 모든 항목을 순서대로 출력
        // favoriteFoods.length 는 배열의 길이(칸 수), 즉 3을 의미합니다.
        for (int i = 0; i < favoriteFoods.length; i++) {
            // 3. (인덱스 + 1)을 하여 번호를 붙여 출력
            System.out.println((i + 1) + ". " + favoriteFoods[i]);
        }
    }

}
