package appendix_01;

import appendix_01.coffee.*;
import appendix_01.user.*;

public class _02_GenericClass {
    public static void main(String[] args) {
/*
        // CoffeeByNumber 객체 생성
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready(); // 대기 번호로 손님 호출
        // CoffeeByNickname 객체 생성
        CoffeeByNickname c2 = new CoffeeByNickname("나도코딩");
        c2.ready(); // 닉네임으로 손님 호출
        CoffeeByName c3 = new CoffeeByName(34);        // 정수 전달
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("나도코딩"); // 문자열 전달
        c4.ready();

        int c3Name = (int) c3.name;       // 형 변환 필요
        System.out.println("주문 고객 번호: " + c3Name);
        String c4Name = (String) c4.name; // 형 변환 필요
        //c4Name = (String) c3.name;
        System.out.println("주문 고객 이름: " + c4Name);
*/

/*
        // T를 Integer로 결정, c5 객체는 정수만 다룰 수 있음
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; // 형 변환 불필요
        System.out.println("주문 고객 번호: " + c5Name);
        // T를 String으로 결정, c6 객체는 문자열만 다룰 수 있음
        Coffee<String> c6 = new Coffee<>("나도코딩");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);
*/

        // Coffee<Integer>는 정수 전용
        //Coffee<Integer> errorCase = new Coffee<>("실수"); // 컴파일 오류 발생


/*        // 일반 회원인 User 객체 생성
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("나도코딩"));
        c7.ready();
        // 특별 회원인 VIPUser 객체 생성
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("나도코딩"));
        c8.ready();*/

        // User와 관련 없는 타입으로 생성 시도
        //CoffeeByUser<String> c9 = new CoffeeByUser<>("나도코딩"); // 컴파일 오류 발생

        orderCoffee("나도코딩");
        orderCoffee(36);
        orderCoffee("나도코딩", "아메리카노"); // 이름, 커피 종류
        orderCoffee(37, "라떼");               // 대기번호, 커피 종류

    }

    // 제네릭 타입 T 하나를 사용하는 메서드
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료: " + name);
    }
    // T와 V, 두 개의 제네릭 타입을 사용하는 메서드
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료: " + name);
    }


}
