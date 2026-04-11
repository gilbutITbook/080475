package chap_13;

public class _05_TryWithResources {
    public static void main(String[] args) {
/*      MyFileWriter writer = null; // 객체를 먼저 선언
        try { // try 블록 안에서 객체를 생성하고 사용
            writer = new MyFileWriter();
            writer.write("아이스크림이 먹고 싶어요.");
*/
        // try 뒤에 오는 소괄호 안에서 자원 객체 생성
        try (MyFileWriter writer = new MyFileWriter()) {
            writer.write("빵이 먹고 싶어요.");
        } catch (Exception e) {
            e.printStackTrace();
/*        } finally { // finally 블록에서 자원 정리
            try {
                // writer.close() 또한 예외를 발생시킬 수 있으므로
                // 또 다른 try-catch로 감싸야 합니다.
                writer.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }*/
        }

    }

}
