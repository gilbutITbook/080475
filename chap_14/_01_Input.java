package chap_14;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위한 Scanner

/*        System.out.println("이름을 입력하세요. ");
        String name = sc.next(); // 한 단어 입력
        System.out.println("혈액형을 입력하세요.");
        String bloodType = sc.next();
        System.out.println("키를 입력하세요.");
        int height = sc.nextInt();
        System.out.println("몸무게를 입력하세요.");
        double weight = sc.nextDouble();

        System.out.println("입력한 정보는 다음과 같습니다.");
        System.out.println("이름: " + name);
        System.out.println("혈액형: " + bloodType);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);*/

        System.out.println("어떤 프로그래밍 언어를 배웠나요?(한 단어로)");
        String lang = sc.next(); // 한 단어 입력받기
        //sc.nextLine(); // 입력 대기 공간을 비우는 역할
        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next(); // 문장 입력받기
        System.out.println("언어: " + lang);
        System.out.println("기분: " + feeling);
    }
}
