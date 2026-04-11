package chap_10;

public class _Quiz_10 {
    public static void main(String[] args) {
        // 1. 다형성을 활용한 배열 생성
        Animal[] animals = new Animal[2];
        animals[0] = new Lion();
        animals[1] = new Penguin();
        System.out.println("동물들의 정보를 출력합니다.");
        System.out.println("-----------------");
        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println("-----------------");
        }
        System.out.println("정보 출력이 완료되었습니다.");
    }
}

/*
부모 클래스: Animal
모든 동물의 공통 속성(name)과 기능(printInfo)을 정의합니다.
*/
class Animal {
    public String name;
    // 생성자: 이름을 받아 초기화합니다.
    public Animal(String name) {
        this.name = name;
    }
    // 공통 기능: 이름을 출력합니다.
    public void printInfo() {
        System.out.println("이름: " + this.name);
    }
}
// 자식 클래스 1: Animal을 상속받습니다.
class Lion extends Animal {
    // 생성자: 부모 생성자(super)를 호출하여 이름을 "사자"로 설정
    public Lion() {
        super("사자");
    }
    // 메서드 오버라이딩(재정의)
    @Override
    public void printInfo() {
        // 1. 부모의 printInfo()를 먼저 호출 (이름 출력)
        super.printInfo();

        // 2. Lion만의 기능 추가
        System.out.println("특징: 아프리카의 초원에서 살며, 멋진 갈기를 가지고 있습니다.");
        System.out.println("울음소리: 낮고 힘 있는 소리를 냅니다.");
    }
}

// 자식 클래스 2: Animal을 상속받습니다.
class Penguin extends Animal {
    // 생성자: 부모 생성자(super)를 호출하여 이름을 "펭귄"으로 설정
    public Penguin() {
        super("펭귄");
    }
    // 메서드 오버라이딩(재정의)
    @Override
    public void printInfo() {
        // 1. 부모의 printInfo()를 먼저 호출 (이름 출력)
        super.printInfo();
        // 2. Penguin만의 기능 추가
        System.out.println("특징: 남극에 살며, 날지 못하지만 수영을 아주 잘합니다.");
        System.out.println("울음소리: 짧고 날카로운 소리를 냅니다.");
    }

}
