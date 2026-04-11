package chap_09_1;

// 개별 클래스를 각각 import
import chap_09.BlackBoxRefurbish02;
import chap_09.BlackBox09;
//import chap_09.A;

// 패키지의 모든 클래스를 한 번에 import
import chap_09.*;




public class _00_AccessModifierTest {
    public static void main(String[] args) {
        // chap_09 패키지의 BlackBoxRefurbish 객체 생성
        BlackBoxRefurbish02 b1 = new BlackBoxRefurbish02();
        BlackBox09 b2 = new BlackBox09();

       // public 변수 접근
        b1.modelName = "까망이";
        System.out.println("모델명: " + b1.modelName);
/*        // default 변수 접근
        b1.resolution = "FHD"; // 오류 발생
        // protected 변수 접근
        b1.color = "블랙"; // 오류 발생
        // private 변수 접근
        b1.price = 200000; // 오류 발생*/

        //b1.getPrice(); // 오류 발생


       // A a = new A();
    }
}

