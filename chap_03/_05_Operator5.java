package chap_03;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 비교할 두 개의 정수(int)를 담을 상자(변수)를 준비해요
        int x = 3;
        int y = 5;
        // 1. 두 수 중 더 큰 값 찾기
        // x가 y보다 크다는 조건이 참이면 x를, 거짓이면 y를 max 변수에 저장
        int max = (x > y) ? x : y;
        System.out.println(max); // 5
        // 2. 두 수 중 더 작은 값 찾기
        // x가 y보다 작다는 조건이 참이면 x를, 거짓이면 y를 min 변수에 저장
        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        // x와 y가 같은지 비교해 boolean 값 선택
        // (x == y)는 '3과 5가 같은가?'-> 거짓이므로 콜론 뒤의 false가 선택됨
        boolean b = (x == y) ? true : false;
        System.out.println(b);
        // x와 y가 다른지 비교해 문자열 선택
        // (x != y)는 '3과 5가 다른가?' -> 참이므로 물음표 뒤의 "달라요"가 선택됨
        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);

    }

}
