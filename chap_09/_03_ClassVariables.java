package chap_09;

public class _03_ClassVariables {
    public static void main(String[] args) {
        // BlackBox03 클래스로부터 b1 객체 생성
        BlackBox03 b1 = new BlackBox03();
        b1.modelName = "까망이"; // b1 객체의 modelName에 "까망이" 저장
        //System.out.println(b1.modelName);
        // BlackBox03 클래스로부터 b2 객체 생성
        BlackBox03 b2 = new BlackBox03();
        b2.modelName = "하양이"; // b2 객체의 modelName에 "하양이" 저장
        //System.out.println(b2.modelName);

        System.out.println("--- 개발 전 ---");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        // 클래스 변수는 클래스 이름으로 직접 접근하는 것을 권장
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox03.canAutoReport);

        System.out.println("--- 개발 후 ---");
        BlackBox03.canAutoReport = true; // 기능 개발 완료
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox03.canAutoReport);
    }

}
