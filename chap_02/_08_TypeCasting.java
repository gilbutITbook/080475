package chap_02;

public class _08_TypeCasting {
    public static void main(String[] args) {
        // 정수를 실수로
        int score = 93;
        System.out.println(score);         // 정수 값 출력
        System.out.println((float) score); // 정수 값을 float로 형 변환
        System.out.println((double) score); // 정수 값을 double로 형 변환

        // 실수를 정수로
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // float 값을 int로 형 변환
        System.out.println((int) score_d); // double 값을 int로 형 변환

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191
        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double(자동 형변환)
        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int(수동 형변환)

        // 숫자를 문자열로 변환
        String s1 = String.valueOf(93);
        //s1 = Integer.toString(93);
        System.out.println(s1);
        String s2 = String.valueOf(98.8);
        //s2 = Double.toString(98.8);
        System.out.println(s2);
        System.out.println("당신의 점수는 " + s1 + "점입니다.");

        // 문자열을 숫자 값으로 변환
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8
        System.out.println(i + 1); // 94
        System.out.println(d + 1); // 99.8

        int error = Integer.parseInt("자바");




    }
}
