package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주어진 암호문
        String encodedText = "별들이 제자리를 찾을 무렵, --START--숨겨진 [KEYWORD]의 위치를 기억하라--END--";
        // 비밀 메시지의 시작 위치 계산
        // --START-- 바로 다음 위치부터 비밀 메시지가 시작됨
        int msgStartIndex = encodedText.indexOf("--START--") + "--START--".length();
        // 비밀 메시지의 끝 위치 계산
        // --END--가 시작되는 위치가 비밀 메시지의 끝
        int msgEndIndex = encodedText.indexOf("--END--");
        // 원본 암호(비밀 메시지) 추출
        String originalMessage = encodedText.substring(msgStartIndex, msgEndIndex);
        // [KEYWORD]를 지혜의 샘으로 교체
        String decodedMessage = originalMessage.replace("[KEYWORD]", "지혜의 샘");
        // 결과 출력
        System.out.println("[암호 해독 결과]");
        System.out.println("원본 암호: " + originalMessage);
        System.out.println("해독된 문장: " + decodedMessage);
    }

}


