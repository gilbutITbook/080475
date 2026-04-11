package chap_12;

import java.util.ArrayList;

class WishlistItem {
    public String name;
    public int price;
    public WishlistItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class _Quiz_12 {
    public static void main(String[] args) {
        // ArrayList 생성: WishlistItem 객체를 저장
        ArrayList<WishlistItem> wishlist = new ArrayList<>();
        // 상품 객체를 생성해 리스트에 추가
        wishlist.add(new WishlistItem("노트북", 150)); // 단위: 만 원
        wishlist.add(new WishlistItem("모니터", 30));
        wishlist.add(new WishlistItem("기계식 키보드", 24));
        wishlist.add(new WishlistItem("무선 마우스", 7));
        wishlist.add(new WishlistItem("노트북 파우치", 4));
        wishlist.add(new WishlistItem("USB 허브", 3));
        wishlist.add(new WishlistItem("마우스 패드", 1));
        // 10만 원 초과 상품 목록 출력
        System.out.println("--- 10만 원 초과 상품 목록 ---");
        for (WishlistItem item : wishlist) {
            if (item.price > 10) {
                System.out.println(item.name + "(" + item.price + "만 원)");
            }
        }
        //System.out.println();
        // 총 합계 계산 및 출력
        int totalPrice = 0;
        for (WishlistItem item : wishlist) {
            totalPrice += item.price; // 각 아이템의 price 변수에 접근해 합산
        }
        System.out.println("--- 총 합계 ---");
        System.out.println(totalPrice + "만 원");
    }
}
