package chap_10;

public class _07_Enum {
    public static void main(String[] args) {
        // 열거형을 사용할 위치
/*
        Resolution res; // Resolution 타입의 res 변수 선언
        res = Resolution.HD; // 열거형 값 할당
        System.out.println("현재 해상도: " + res);
        res = Resolution.FHD; // 값 변경
        System.out.println("변경된 해상도: " + res);
*/

/*
        Resolution res = Resolution.FHD; // 현재 해상도는 FHD
        System.out.print("동영상 녹화 품질: ");
        // res 변수의 값에 따라 다른 코드를 실행
       switch (res) {
            case HD: // res 값이 Resolution.HD라면
                System.out.println("일반 화질");
                break;
            case FHD: // res 값이 Resolution.FHD라면
                System.out.println("고화질");
                break;
            case UHD: // res 값이 Resolution.UHD라면
                System.out.println("초고화질");
                break;
        }
*/

        System.out.println("--- Resolution의 모든 상수와 순서 ---");
        for (Resolution myRes : Resolution.values()) {
            // values(): 열거형에 정의한 모든 상수를 배열로 반환
            // name(): 상수 이름을 문자열로 반환
            // ordinal(): 상수가 정의된 순서를 0부터 반환
            System.out.println(myRes.name() + ": " + myRes.ordinal());
        }
        System.out.println("--- 문자열로 열거형 상수 찾기 ---");
        String input = "UHD";
        // valueOf(문자열): 해당 문자열과 일치하는 이름을 가진 상수를 찾아 반환
        Resolution res = Resolution.valueOf(input);
        System.out.println("찾은 상수: " + res);

        System.out.println("--- 해상도 이름과 가로 크기 ---");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + ": " + myRes.getWidth() + "px");
        }
    }
}
// 열거형 정의
enum Resolution {
    //HD, FHD, UHD
    // 각 상수가 괄호 안에 값을 가지도록 정의
    HD(1280), FHD(1920), UHD(3840);
    // 값을 저장할 private final 변수
    private final int width;
    // 생성자: 괄호 안의 값을 받아 width 변수에 할당
    Resolution(int width) {
        this.width = width;
    }
    // 외부에서 값을 가져갈 수 있는 게터
    public int getWidth() {
        return width;
    }
}

