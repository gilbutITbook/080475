package appendix_01.coffee;
import appendix_01.user.User;

// T는 반드시 User이거나 User를 상속한 클래스여야 함
public class CoffeeByUser<T extends User>{
    public T user;
    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready() {
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint(); // T는 User를 상속하므로 addPoint()가 반드시 있음
    }

}
