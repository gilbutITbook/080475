package chap_08;

public class _04_ParameterAndReturn {
    // 숫자를 전달받아 제곱을 반환하는 메서드
    public static int getPower(int number) {
        int result = number * number; // 전달받은 number를 제곱해 result에 저장
        return result;                // 계산 결과를 메서드 밖으로 반환
    }

    // 밑(number)과 지수(exponent)를 전달받아 거듭제곱을 반환하는 메서드
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // number를 exponent번 곱함
        }
        return result; // 최종 계산 결과 반환
    }

    public static void main(String[] args) {
/*        // getPower 메서드에 2를 전달하고, 반환값을 retVal 변수에 저장
        int retVal = getPower(2);
        System.out.println(retVal);
        // getPower 메서드에 3을 전달하고, 반환값을 다시 retVal 변수에 저장
        retVal = getPower(3);
        System.out.println(retVal);*/

        // 반환값을 변수에 저장해 사용
        int retVal = getPowerByExp(3, 3);
        System.out.println(retVal);
        // 반환값을 변수 없이 바로 사용
        System.out.println(getPowerByExp(2, 4));

    }


}
