package chap_08;

public class _08_MainMethod {
    public static void main(String[] args){
/*        // Program arguments로 전달받은 값들을 순서대로 출력
        for (String s : args) {
            System.out.println(s);
        }
*/

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        // 전달값의 개수가 1개일 때만 메뉴 처리
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            // 전달값의 개수가 1개가 아닐 경우
            System.out.println("사용법) 메뉴 1~3 중 하나를 입력하세요.");
        }


    }
}
