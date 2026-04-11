package chap_09;

public class _07_This {
    public static void main(String[] args) {
        // BlackBox07 객체 생성
        BlackBox07 b1 = new BlackBox07();
        // 객체의 모델명 설정
        b1.modelName = "까망이";
        // 모델명 뒤에 문구 추가
        b1.appendModelName("(최신형)");
        // 최종 모델명 출력
        System.out.println(b1.modelName);


    }

}
