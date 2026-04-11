package appendix_02;

import java.util.Arrays;            // 배열을 스트림으로 변환하기 위해 추가
import java.util.List;
import java.util.stream.IntStream;  // 정수형 데이터를 처리하는 스트림 타입
import java.util.stream.Stream;     // 문자열 데이터를 처리하는 스트림 타입


public class _04_Stream1 {
    public static void main(String[] args) {
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); // 정수 배열 스트림 생성
        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs); // 문자열 배열 스트림 생성
        List<String> langList =
                Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        Stream<String> langListStream = langList.stream(); // 리스트 스트림 생성
        Stream<String> langListOfStream =
                Stream.of("python", "java", "javascript", "c", "c++", "c#");


    }
}

