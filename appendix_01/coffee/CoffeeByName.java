package appendix_01.coffee;

public class CoffeeByName {
    public Object name; // 어떤 타입의 객체든 저장 가능
    public CoffeeByName(Object name) {
        this.name = name;
    }
    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }

}
