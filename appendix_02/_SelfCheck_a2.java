package appendix_02;

interface Button {
    void onClick();
}

public class _SelfCheck_a2 {
    public static void main(String[] args) {
        Button tvButton = new Button() {
            @Override
            public void onClick() {
                System.out.println("TV를 켭니다.");
            }
        };
        Button airconButton = new Button() {
            @Override
            public void onClick() {
                System.out.println("에어컨을 냉방 모드로 가동합니다.");
            }
        };
        tvButton.onClick();
        airconButton.onClick();
    }
}
