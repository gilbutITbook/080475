package chap_13;

public class _02_Catch {
    public static void main(String[] args) {
        try {
/*            System.out.println(3 / 0); // ArithmeticException 발생
            int[] arr = new int[3];
            arr[5] = 100; // ArrayIndexOutOfBoundsException 발생
            Object obj = "test";
            System.out.println((int) obj); // ClassCastException 발생*/
            String s = null;
            System.out.println(s.toLowerCase()); // NullPointerException 발생
        } catch (ArithmeticException e) { // 0으로 나누는 예외만 별도 처리
            System.out.println("뭔가 잘못된 계산을 했어요.");
        } catch (ArrayIndexOutOfBoundsException e) { // 배열 인덱스 예외 처리 추가
            System.out.println("인덱스를 잘못 설정했어요.");
 /*       } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 실수했어요.");*/
        } catch (ClassCastException e) { // 형 변환 예외 처리 추가
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {
            //System.out.println("이런 문제가 발생했어요. => " + e.getMessage());
            System.out.println("그 외의 모든 예외는 여기서 처리해요.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }

}
