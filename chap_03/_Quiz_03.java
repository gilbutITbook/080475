package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 세 사람의 몸무게를 int 변수에 저장
        int weight1 = 68; // 단위 kg
        int weight2 = 75;
        int weight3 = 72;
        // 1단계: weight1과 weight2 중 더 무거운 몸무게를 찾는다
        int tempMaxWeight = (weight1 > weight2) ? weight1 : weight2;
        // 2단계: 1단계 결과와 weight3를 비교해 최종 꼴찌를 찾는다
        int loserWeight = (tempMaxWeight > weight3) ? tempMaxWeight : weight3;
        // 정해진 형식으로 결과 출력
        System.out.println("꼴찌의 몸무게는 " + loserWeight + "kg입니다.");
    }
}
