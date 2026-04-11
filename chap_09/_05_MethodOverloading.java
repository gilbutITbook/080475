package chap_09;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox05 b1 = new BlackBox05();
        b1.modelName = "까망이";
/*
        // 시나리오 1: 날짜/시간, 속도 표시 없이 10분 단위로 녹화
        System.out.println("--- 시나리오 1 ---");
        b1.record(false, false, 10);
        // 시나리오 2: 날짜/시간은 표시, 속도는 표시 안 함, 3분 단위로 녹화
        System.out.println("--- 시나리오 2 ---");
        b1.record(true, false, 3);
        // 시나리오 3: 날짜/시간, 속도 모두 표시, 5분 단위로 녹화
        System.out.println("--- 시나리오 3 ---");
        b1.record(true, true, 5);
*/

        // 상세 설정으로 녹화
        b1.record(false, false, 10);
        System.out.println("------------------------");
        // 기본 설정으로 간편하게 녹화
        b1.record(); // 오버로딩한 메서드 호출

    }

}
