package appendix_01.user;

public class User {
    public String name;
    public User(String name) {
        this.name = name;
    }
    public void addPoint() {
        System.out.println(name + " 님, 포인트가 적립되었습니다.");
    }
}
