package chap_10;

import chap_10.camera.Camera04;

public class _05_Reference {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("변경 전: a = " + a + ", b = " + b);
        b = a; // b에 a의 값(10)을 복사
        System.out.println("변경 후: a = " + a + ", b = " + b);
        b = 30; // b의 값을 30으로 변경
        System.out.println("b = 30 후: a = " + a + ", b = " + b);

        Camera04 c1 = new Camera04();
        c1.name = "카메라1";
        Camera04 c2 = new Camera04();
        c2.name = "카메라2";
        System.out.println("변경 전 c1: " + c1.name);
        System.out.println("변경 전 c2: " + c2.name);
        System.out.println("--- c2 = c1 실행 ---");
        c2 = c1;
        System.out.println("c2 = c1 후 c1: " + c1.name);
        System.out.println("c2 = c1 후 c2: " + c2.name);
        System.out.println("--- c2의 이름 변경 ---");
        c2.name = "고장난 카메라";
        System.out.println("c2 이름 변경 후 c1: " + c1.name);
        System.out.println("c2 이름 변경 후 c2: " + c2.name);

        changeName(c2);
        System.out.println("메서드에서 이름 변경 후 c1: " + c1.name);
        System.out.println("메서드에서 이름 변경 후 c2: " + c2.name);

        c2 = null; // c2가 잡고 있던 풍선을 놓음(연결을 끊음)
        System.out.println(c2.name); // 아무것도 없는데 이름을 물어봄

    }
    public static void changeName(Camera04 camera) {
        camera.name = "잘못된 카메라";
    }


}
