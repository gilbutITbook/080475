package appendix_01.coffee;

public class CoffeeByNickname {
    public String nickname; // 닉네임을 저장할 공간(문자열만 가능)
    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }
    public void ready() {
        System.out.println("커피 준비 완료: " + nickname);
    }

}
