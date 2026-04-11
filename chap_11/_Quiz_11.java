package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        // 기사, 마법사 객체 생성
        Knight knight = new Knight("기사", 100, 15);
        Wizard wizard = new Wizard("마법사", 80, 10);
        System.out.println("--- 전투 시작! ---");
        knight.showStatus();
        wizard.showStatus();
        System.out.println();
        // 1턴: 마법사의 공격
        System.out.println("--- 1턴 ---");
        wizard.attack(knight);
        System.out.println();
        // 2턴: 기사의 공격
        System.out.println("--- 2턴 ---");
        knight.attack(wizard);
        System.out.println();
        // 3턴: 마법사의 스킬 사용
        System.out.println("--- 3턴 ---");
        wizard.useSkill(knight);
        System.out.println();
        System.out.println("--- 전투 종료 ---");
    }
}

interface SkillUser { // 스킬 사용이 가능한 능력을 정의하는 인터페이스
    void useSkill(GameCharacter target);
}

abstract class GameCharacter { // 모든 게임 캐릭터의 부모가 될 추상 클래스
    protected String name;
    protected int hp;
    protected int power;
    // 생성자: 이름, 체력, 공격력을 초기화
    public GameCharacter(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }
    public abstract void attack(GameCharacter target); // 공격 기능
    public void takeDamage(int damage) { // 피해를 입는 기능
        this.hp -= damage;
        System.out.println(">> " + this.name + "가 " + damage
                + "의 피해를 입었습니다.(남은 체력: " + this.hp + ")");
    }
    public void showStatus() { // 현재 상태를 보여주는 기능
        System.out.println("상태) " + this.name + ", 남은 체력: " + this.hp);
    }
}

class Knight extends GameCharacter { // GameCharacter를 상속받는 Knight 클래스
    // 생성자: 부모 클래스의 생성자를 호출해 초기화
    public Knight(String name, int hp, int power) {
        super(name, hp, power);
    }
    @Override
    public void attack(GameCharacter target) { // 추상 메서드 구현: 기본 검 공격
        System.out.println(this.name + "가 " + target.name + "를 검으로 공격합니다!");
        target.takeDamage(this.power);
    }
}

// GameCharacter를 상속하고 SkillUser 인터페이스를 구현하는 Wizard 클래스
class Wizard extends GameCharacter implements SkillUser {
    // 생성자: 부모 클래스의 생성자를 호출해 초기화
    public Wizard(String name, int hp, int power) {
        super(name, hp, power);
    }
    @Override
    public void attack(GameCharacter target) { // 추상 메서드 구현: 기본 마법 공격
        System.out.println(this.name + "가 " + target.name
                + "를 기본 마법으로 공격합니다!");
        target.takeDamage(this.power);
    }
    @Override
    public void useSkill(GameCharacter target) { // 인터페이스 메서드 구현: 스킬 공격
        System.out.println(this.name + "가 " + target.name
                + "에게 윈드 블레이드 스킬을 사용합니다!");
        target.takeDamage(this.power * 2);
    }
}

