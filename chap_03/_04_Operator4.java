package chap_03;

public class _04_Operator4 {
    public static void main(String[] args) {
/*        boolean 김치찌개 = false; // 김치찌개는 없다
        boolean 계란말이 = false; // 계란말이도 없다
        boolean 제육볶음 = true; // 제육볶음은 있다
        // 세 메뉴 중 하나라도 있으면 true
        System.out.println(김치찌개 || 계란말이 || 제육볶음);*/

        // 5가 3보다 크거나(true), 3이 1보다 크다(true)
        System.out.println((5 > 3) || (3 > 1));
        // 5가 3보다 크거나(true), 3이 1보다 작다(false)
        System.out.println((5 > 3) || (3 < 1));
        // 5가 3보다 작거나(false), 3이 1보다 작다(false)
        System.out.println((5 < 3) || (3 < 1));

        boolean 김치찌개 = true; // 김치찌개는 있다
        boolean 계란말이 = true; // 계란말이도 있다
        boolean 제육볶음 = false; // 아쉽게도 제육볶음은 없다!
        // 세 메뉴가 모두 있어야 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        // 5는 3보다 크고(true), 3은 1보다 크다(true)
        System.out.println((5 > 3) && (3 > 1));
        // 5는 3보다 크고(true), 3은 1보다 작다(false)
        System.out.println((5 > 3) && (3 < 1));

        System.out.println(!true); // true의 반대
        System.out.println(!false); // false의 반대
        System.out.println(!(5 == 5)); // (5 == 5)의 반대
        System.out.println(!(5 == 3)); // (5 == 3)의 반대

    }
}
